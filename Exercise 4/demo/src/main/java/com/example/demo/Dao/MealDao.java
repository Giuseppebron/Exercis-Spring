package com.example.demo.Dao;

import com.example.demo.Meal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MealDao {
    List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal){
        this.meals.add(meal);
    }
    public  void deleteMeal(String mealName){
        for (Meal m:meals) {
            if (m.getName().equals(mealName)){
                meals.remove(m);
            }
        }
    }
    public void updateMeal(Meal meal){
        for (Meal m: meals) {
            if (m.getName().equals(meal.getName())) {
                m.setName(meal.getName());
            }
        }
    }
    public  List<Meal> getMeals(){
        return this.meals;
    }
}
