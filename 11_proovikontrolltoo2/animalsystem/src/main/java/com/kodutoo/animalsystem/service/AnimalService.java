package com.kodutoo.animalsystem.service;

import com.kodutoo.animalsystem.model.Animal;

import java.util.List;

public interface AnimalService {
    public Animal saveAnimal(Animal animal);
    public List<Animal> getAllAnimals();
}
