package com.example.dockeraws.controllers;

import com.example.dockeraws.dao.CarDAO;
import com.example.dockeraws.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/cars")

public class CarController {
    private final CarDAO carDAO;

    @PostMapping
    public Car saveCar(@RequestBody Car car){
        return carDAO.save(car);
    }

    @GetMapping
    public List<Car> cars(){
        return carDAO.findAll();
    }
}
