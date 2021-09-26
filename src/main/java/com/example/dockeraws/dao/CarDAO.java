package com.example.dockeraws.dao;

import com.example.dockeraws.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car, Integer> {
}
