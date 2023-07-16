package com.sia.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sia.entities.Ingredient;

@CrossOrigin(origins = "http://localhost:8080")
public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
