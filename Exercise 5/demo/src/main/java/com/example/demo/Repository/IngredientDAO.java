package com.example.demo.Repository;

import com.example.demo.Entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientDAO extends JpaRepository<Ingredient, Long> {
}
