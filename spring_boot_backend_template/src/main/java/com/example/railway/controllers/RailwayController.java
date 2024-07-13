package com.example.railway.controllers;

import com.example.railway.entities.Railway;
import com.example.railway.services.RailwayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/railways")
@Validated
public class RailwayController {
    @Autowired
    private RailwayService railwayService;

    @PostMapping
    public ResponseEntity<Railway> addRailway(@Valid @RequestBody Railway railway) {
        if (railway.getStartTime().isAfter(railway.getEndTime())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        Railway createdRailway = railwayService.addRailway(railway);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdRailway);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRailway(@PathVariable Long id) {
        if (!railwayService.getRailwayById(id).isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        railwayService.deleteRailway(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<List<Railway>> getRailwaysByCategory(@PathVariable String category) {
        List<Railway> railways = railwayService.getRailwaysByCategory(category);
        if (railways.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(railways);
    }
}
