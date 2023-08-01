package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
@RestController
public class Exercise {
    @GetMapping("/info")
    public ResponseEntity<String> response(){
        return ResponseEntity.ok("200 OK");
    }

    @GetMapping(value = "/random")
    public ResponseEntity<Boolean> saraVeroOppureFalso(){
        boolean trueOrFalse = new Random().nextBoolean();
        if (trueOrFalse == true){
            return ResponseEntity.ok(true);
        }else {
            return ResponseEntity.badRequest().body(false);
        }
    }
}
