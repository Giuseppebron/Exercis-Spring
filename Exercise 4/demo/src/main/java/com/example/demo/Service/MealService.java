package com.example.demo.Service;

import com.example.demo.Dao.MealDao;
import com.example.demo.Meal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealService {
    private MealDao mealDao;
@Autowired
    public MealService(MealDao mealDao) {
        this.mealDao = mealDao;
    }

    public void addMeal(Meal meal){
    if (meal == null)throw new IllegalArgumentException("meal cannot be null!");
    if (meal.getName() == null || meal.getName().isEmpty()) throw new IllegalArgumentException("meal name can not be null");
    if (meal.getDescription() == null || meal.getDescription().isEmpty()) throw new IllegalArgumentException("meal description can not be null");
    if (meal.getPrice() <= 0) throw new IllegalArgumentException("price cannot be less or equal 0");
    if (meal.getPrice() > 100) throw new IllegalArgumentException("price cannot be greater than 100");
    mealDao.addMeal(meal);
    }
    public  void deleteMeal(String mealName){
    mealDao.deleteMeal(mealName);
    }
    public void updateMeal(Meal meal){
    mealDao.updateMeal(meal);
    }
    public List<Meal> getMeals(){
    return mealDao.getMeals();
    }
}
