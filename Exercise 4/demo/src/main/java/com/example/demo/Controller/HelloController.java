package com.example.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/hello")
    public String s(){
        return "hello world";
    }
    @GetMapping("/greeting")
    public ResponseEntity<String> response(){
        return ResponseEntity.ok("200 ok");
    }
}
