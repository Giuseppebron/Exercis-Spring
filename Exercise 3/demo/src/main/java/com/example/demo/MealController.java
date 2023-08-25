package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealController {
    List<Meal> meals = new ArrayList<>();
    @GetMapping("/get/meals")
    public List<Meal> x(){
        return meals;
    }

    @PostMapping("/meal/")
    public String mealsPost (@RequestBody Meal meal){
        meals.add(meal);
        return "meal added";
    }
    @PutMapping("/meal/{name}")
    public String  mealUpdateByName(@PathVariable("name") String mealName,@RequestBody Meal updatedMeal){
        for (Meal m: meals) {
            if (m.getName().contains(mealName)) {
                m.setName(updatedMeal.getName());
                return "meal update";
            }
        }return null;
    }
    @DeleteMapping("/meal/{name}")
    public String mealDelete(@PathVariable("name") String nome){
        for (Meal m:meals) {
            if (m.getName().contains(nome)){
                meals.remove(m);
                return "meal deleted";
            }
        }return null;
    }

    @DeleteMapping("/meal/price/{price}")
    public void mealDeleteByPrice(@PathVariable("price") double price){
        List<Meal> mealsUnderPrice = new ArrayList<>();
        for (Meal m:meals) {
            if (m.getPrice() >= price){
                mealsUnderPrice.add(m);
            }
        }meals = mealsUnderPrice;
    }
    @PutMapping("/meal/{name}/price")
    public void mealUpdateByPrice(@PathVariable("name") String name,@RequestBody Meal meal){
        for (Meal m:meals) {
            if (m.getName().contains(name)){
                m.setPrice(meal.getPrice());
            }
        }
    }


}
