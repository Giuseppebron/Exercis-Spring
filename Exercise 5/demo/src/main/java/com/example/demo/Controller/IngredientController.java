package com.example.demo.Controller;

import com.example.demo.Entity.Ingredient;
import com.example.demo.Service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class IngredientController {
    @Autowired
    private IngredientService ingredientService;
    //prova
    @PostMapping("/ingredientiprova")
    public void ingredienti (){
        Ingredient ingredient1 = new Ingredient("tomato",true,false,true,true);
        Ingredient ingredient2 = new Ingredient("sbobba",true,false,true,true);
        ingredientService.createIngredient(ingredient1);
        ingredientService.createIngredient(ingredient2);
    }
    @GetMapping("/getingredient/{id}")
    public ResponseEntity<Optional<Ingredient>> ingredientById(@PathVariable Long id){
        Optional<Ingredient> i = ingredientService.getIngredient(id);
       if (i.isPresent()){
           return ResponseEntity.ok(i);
       }else return ResponseEntity.badRequest().build();
    }
    @PostMapping("/newingredient")
    public  ResponseEntity<?> ingredientPost (@RequestBody Ingredient ingredient){
        Ingredient i = ingredientService.createIngredient(ingredient);
        return ResponseEntity.ok("aggiunto "+ i.getName()+  " al database");
    }
    @PutMapping("/updateingredient/{id}")
    public ResponseEntity<Optional<Ingredient>> ingredientUpdate (@PathVariable Long id,@RequestBody Ingredient ingredient){
        if(ingredientService.getIngredient(id).isPresent()){
            return ResponseEntity.ok(ingredientService.updateIngredient(ingredient,id));
        }else return ResponseEntity.badRequest().build();
    }
    @DeleteMapping("/deleteingredient/{id}")
    public ResponseEntity<?> ingredientDelete(@PathVariable Long id){
        Optional<Ingredient> i = ingredientService.getIngredient(id);
        if (i.isPresent()){
            ingredientService.deleteIngredient(id);
            return ResponseEntity.ok("ingredient deleted");
        }else return ResponseEntity.badRequest().body("ingredeint not found");
    }
}
