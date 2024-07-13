package com.example.railway.repositories;

import com.example.railway.entities.Railway;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RailwayRepository extends JpaRepository<Railway, Long> {
    List<Railway> findByCategory(String category);
}
