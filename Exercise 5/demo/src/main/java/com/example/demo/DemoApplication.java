package com.example.demo;
/*Exercise 1:

		1.Create an Entity called Ingredient
		2.Create a controller, service, repository
		3.Set up CRUD operations for this entity
		4.Drop your ingredient table in your db if it still exists to avoid issues/confusion!

public class Ingredient {
	private Long id;
	private String name;
	private boolean isVegetarian;
	private boolean isVegan;
	private boolean isGlutenFree;
	private boolean isLactoseFree;
}*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
