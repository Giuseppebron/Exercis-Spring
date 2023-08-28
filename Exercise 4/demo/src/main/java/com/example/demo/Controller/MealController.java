package com.example.demo.Controller;

import com.example.demo.Meal;
import com.example.demo.Service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MealController {
    private MealService mealService;
@Autowired
    public MealController(MealService mealService) {
        this.mealService = mealService;
    }

    @GetMapping("/get/meals")
    public List<Meal> x(){
        return mealService.getMeals();
    }
    @PutMapping("/put/meals")
    public String  mealUpdateByName(@RequestBody Meal meal){
        mealService.addMeal(meal);
        return "meal add";
    }
    @DeleteMapping("/delete/meal/{mealName}")
    public String mealDelete(@PathVariable String mealName){
        mealService.deleteMeal(mealName);
        return "meal deleted";
    }
}
