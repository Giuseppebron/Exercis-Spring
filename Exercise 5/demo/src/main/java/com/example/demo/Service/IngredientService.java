package com.example.demo.Service;

import com.example.demo.Entity.Ingredient;
import com.example.demo.Repository.IngredientDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IngredientService {
    @Autowired
    private IngredientDAO ingredientDao;

    public Optional<Ingredient> getIngredient(Long id){
    return this.ingredientDao.findById(id);
    }
    public Ingredient createIngredient(Ingredient ingredient){
    this.ingredientDao.save(ingredient);
    return ingredient;
    }
    public Optional<Ingredient> updateIngredient(Ingredient ingredient, Long id) {
        Optional<Ingredient> i = ingredientDao.findById(id);
        if (i.isPresent()){
            i.get().setName(ingredient.getName());
            i.get().setVegetarian(ingredient.isVegetarian());
            i.get().setVegan(ingredient.isVegan());
            i.get().setGlutenFree(ingredient.isGlutenFree());
            i.get().setLactoseFree(ingredient.isLactoseFree());
            ingredientDao.save(i.get());
            return i;
        }else return Optional.empty();
    }
    public void deleteIngredient(Long id){
        ingredientDao.deleteById(id);
    }
}

