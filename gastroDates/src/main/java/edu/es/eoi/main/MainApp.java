package edu.es.eoi.main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;
import edu.es.eoi.entity.User;
import edu.es.eoi.ui.LoginMenu;

public class MainApp {
	
	public static Map<String, User> users=new HashMap<String, User>();	
	public static Map<String, Recipe> recipes=new HashMap<String, Recipe>();	
	public static User user;

	public static void main(String[] args) {
		
		initUsers();		
		initRecipes();
		
		//arrancar mi UI
		LoginMenu.printMenuLogin();		
	
	}

	private static void initUsers() {
		
		User person= new User();
		person.setName("Pepe");
		person.setSurname("Palotes");
		person.setUsername("pepe");
		person.setPassword("password");
				
		users.put(person.getUsername(), person);
		
		person= new User();
		person.setName("Marta");
		person.setSurname("Martinez");
		person.setUsername("marta");
		person.setPassword("password");
		
		users.put(person.getUsername(), person);
	}
	
	private static void initRecipes() {
		
		Recipe recipe= new Recipe();
		recipe.setRecipeName("chuleton a la brasa");
		recipe.setDescription("receta flipante");
		recipe.setValoration(5.0);
		
		Ingredient ingrediente1= new Ingredient();
		ingrediente1.setName("carne");
		ingrediente1.setAmount(1000);
		ingrediente1.setPrice(20);
		
		Ingredient ingrediente2= new Ingredient();
		ingrediente2.setName("sal");
		ingrediente2.setAmount(10);
		ingrediente2.setPrice(0.30);
		
		Set<Ingredient> ingredientes= new HashSet<>();
		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);
		
		recipe.setIngredients(ingredientes);
		
		recipes.put(recipe.getRecipeName(), recipe);
	}

}
