package com.kodutoo.animalsystem.repository;

import com.kodutoo.animalsystem.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{
}
