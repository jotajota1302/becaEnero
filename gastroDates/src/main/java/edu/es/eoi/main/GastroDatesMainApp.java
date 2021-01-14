package edu.es.eoi.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;
import edu.es.eoi.entity.User;
import edu.es.eoi.ui.LoginMenu;

public class GastroDatesMainApp {

	public static Map<String, User> users = new HashMap<String, User>();
	public static Map<String, Recipe> recipes = new HashMap<String, Recipe>();
	public static User user;
	public static Properties properties = new Properties();
	
	private static Logger logger = Logger.getLogger(GastroDatesMainApp.class);

	public static void main(String[] args) {

		logger.info("Entro en el metodo main de mi aplicacion:");

		try {
			readProperties();
		} catch (IOException e) {
			logger.error("archivo properties no encontrado");
		}
		initUsers();
		initRecipes();

		// arrancar mi UI
		LoginMenu.printMenuLogin();

		logger.info("Salgo del metodo main de mi aplicacion:");

	}

	private static void readProperties() throws IOException {

		logger.info("Entro en el metodo readProperties de mi aplicacion:");
		logger.debug("Ruta del archivo: " + "src/main/resources/application.properties");

		FileInputStream input = new FileInputStream(new File("src/main/resources/application.properties"));

		properties.load(input);

		logger.info("Salgo del metodo readProperties de mi aplicacion:");

	}

	public static void initUsers() {

		User person = new User();
		person.setName("Pepe");
		person.setSurname("Palotes");
		person.setUsername("pepe");
		person.setPassword("password");

		users.put(person.getUsername(), person);

		person = new User();
		person.setName("Marta");
		person.setSurname("Martinez");
		person.setUsername("marta");
		person.setPassword("password");

		users.put(person.getUsername(), person);
	}

	public static void initRecipes() {

		Recipe recipe = new Recipe();
		recipe.setRecipeName("chuleton a la brasa");
		recipe.setDescription("receta flipante");
		recipe.setValoration(5.0);

		Ingredient ingrediente1 = new Ingredient();
		ingrediente1.setName("carne");		
		ingrediente1.setPrice(20);

		Ingredient ingrediente2 = new Ingredient();
		ingrediente2.setName("sal");		
		ingrediente2.setPrice(0.30);

		Set<Ingredient> ingredientes = new HashSet<>();
		ingredientes.add(ingrediente1);
		ingredientes.add(ingrediente2);

		recipe.setIngredients(ingredientes);

		recipes.put(recipe.getRecipeName(), recipe);
	}

}
