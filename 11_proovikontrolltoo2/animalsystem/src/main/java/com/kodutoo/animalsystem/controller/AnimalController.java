package com.kodutoo.animalsystem.controller;

import com.kodutoo.animalsystem.model.Animal;
import com.kodutoo.animalsystem.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animal")
@CrossOrigin
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @PostMapping("/add")
    public String add(@RequestBody Animal animal){
        animalService.saveAnimal(animal);
        return "New animal is added";
    }

    @GetMapping("/getAll")
    public List<Animal> getAllAnimals(){
        return animalService.getAllAnimals();
    }
}
