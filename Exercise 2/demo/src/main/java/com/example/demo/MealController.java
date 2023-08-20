package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MealController {
    List<Meal> chefsSpecials = Arrays.asList(
            new Meal("spaghetti al sugo", "spagetti con pomodoro e basilico", 11),
            new Meal("bistecca", "bistecca cotta ai ferri", 19.99),
            new Meal("sbobba", "origine sconosciuta", 9),
            new Meal("sashimi di tonno", "ventresca di tonno", 20)
    );

    @GetMapping("/meal")
    public ResponseEntity<List> piatti() {
        return ResponseEntity.ok(chefsSpecials);
    }

    @GetMapping("/meal/{name}")

    public ResponseEntity<?> piattiByName(@PathVariable("name") String nameIndex) {
        for (Meal m : chefsSpecials) {
            if (m.getName().contains(nameIndex)) {
                return ResponseEntity.ok(m);
            }
        }return ResponseEntity.badRequest().body("la pietanza non e'contenuta nel menu");
    }
    @GetMapping("/meal/description-match/{phrase}")
    public ResponseEntity<?> piattiByDescription (@PathVariable("phrase") String frase) {
        for (Meal m:chefsSpecials) {
            if (m.getDescription().contains(frase)){
                return ResponseEntity.ok(m);
            }
        }return ResponseEntity.badRequest().body("la frase non e' contenuta nella descrizione");
    }
    @GetMapping("/meal/price")
    public ResponseEntity<?> piattiByPrice (@RequestParam ("min") double min, @RequestParam("max")double max){
        for (Meal m: chefsSpecials) {
            if (m.getPrice() >= min & m.getPrice() <= max){
                return ResponseEntity.ok(m);
            }
        }return ResponseEntity.badRequest().body("la frase non e' contenuta nella descrizione");
    }
}
