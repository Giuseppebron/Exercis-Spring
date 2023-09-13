# Exercis-Spring
exercise from develop about Spring

-Exercise 1{Create a GetMapping that returns a basic "string" as a response

1 - Create a new endpoint "/hello" using the @GetMapping annotation. 2 - In the method, return a simple string such as "Hello World!".

Exercise 2: Create a GetMapping that returns a ResponseEntity as a response

1 - Create a new endpoint "/greeting" using the @GetMapping annotation. 2 - In the method, return a ResponseEntity object with a string message such as "Good Afternoon!". 3 - You can also set the HTTP status code in the ResponseEntity, such as "200 OK".

Exercise 3: Create a new class with a GetMapping that returns a ResponseEntity a

1 - Annotate a new class with the @RestController annotation. 2 - Create a new endpoint "/info" using the @GetMapping annotation. 3 - In the method, return a ResponseEntity with 200 OK

Exercise 4: Create a GetMapping that returns 400 - Bad request or 200 - OK based on a random boolean};
/////////////////////////////////////////////////////////////

-Exercise 2{Exercise 1: Create a GetMapping that returns a list of meals

1 - Annotate a new class with the @RestController annotation. 2 - Create a new endpoint "/meals" using the @GetMapping annotation. 3 - In the method, return a list of Meal objects.

Exercise 2: Create a GetMapping that returns a meal by name

1 - Annotate a new class with the @RestController annotation. 2 - Create a new endpoint "/meal/{name}" using the @GetMapping annotation. 3 - In the method, add a query parameter "name" using the @PathVariable annotation. 4 - Return a Meal object with the corresponding name.

Exercise 3: Create a GetMapping that returns a meal by any word of description

1 - Annotate a new class with the @RestController annotation. 2 - Create a new endpoint "/meal/description-match/{phrase}" using the @GetMapping annotation. 3 - In the method, add a query parameter "description" using the @PathVariable annotation. 4 - Return a Meal object with the corresponding description.

Exercise 4: Create a GetMapping that returns a meal by price range

1 - Annotate a new class with the @RestController annotation. 2 - Create a new endpoint "/meal/price" using the @GetMapping annotation. 3 - In the method, add two query parameters "min" and "max" using the @RequestParam annotation. 4 - Return a list of Meal objects with prices within the specified range.};
/////////////////////////////////////////////////////////////

-Exercise 3{Exercise 1: Create a PutMapping to add a new meal

1 - Create a new endpoint "/meal" using the @PostMapping annotation. 3 - In the method, add a RequestBody for the new Meal object. 4 - Add the new meal to the list of meals.

Exercise 2: Create a PostMapping to update a meal by name

1 - Create a new endpoint "/meal/{name}" using the @PutMapping annotation. 2 - In the method, add a PathVariable for the name and a RequestBody for the updated Meal object. 3 - Update the meal with the corresponding name using the information from the RequestBody.

Exercise 3: Create a DeleteMapping to delete a meal by name

1 - Create a new endpoint "/meal/{name}" using the @DeleteMapping annotation. 2 - In the method, add a PathVariable for the name. 3 - Delete the meal with the corresponding name.

Exercise 4: Create a DeleteMapping to delete all meals above a certain price

1 - Create a new endpoint "/meal/price/{price}" using the @DeleteMapping annotation. 2 - In the method, add a PathVariable for the price. 3 - Delete all meals with a price above the price from the PathVariable.

Exercise 5: Create a PutMapping to update the price of a meal by name

1 - Create a new endpoint "/meal/{name}/price" using the @PutMapping annotation. 2 - In the method, add a PathVariable for the name and a RequestBody for the updated price. 3 - Update the price of the meal with the corresponding name using the information from the RequestBody.};
/////////////////////////////////////////////////////////////

-Exercise 4{Exercise 1: Replicate the entire video, with Controller, Service and Dao Layers!}
/////////////////////////////////////////////////////////////

-Exercise 5{Exercise 1:

Create an Entity called Ingredient
Create a controller, service, repository
Set up CRUD operations for this entity
Drop your ingredient table in your db if it still exists to avoid issues/confusion!

public class Ingredient {
    private Long id;
    private String name;
    private boolean isVegetarian;
    private boolean isVegan;
    private boolean isGlutenFree;
    private boolean isLactoseFree;
};

/////////////////////////////////////////////////////////////
