package com.example.railway.services;

import com.example.railway.entities.Railway;
import com.example.railway.repositories.RailwayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RailwayService {
    @Autowired
    private RailwayRepository railwayRepository;

    public Railway addRailway(Railway railway) {
        return railwayRepository.save(railway);
    }

    public void deleteRailway(Long id) {
        railwayRepository.deleteById(id);
    }

    public List<Railway> getRailwaysByCategory(String category) {
        return railwayRepository.findByCategory(category);
    }

    public Optional<Railway> getRailwayById(Long id) {
        return railwayRepository.findById(id);
    }
}
