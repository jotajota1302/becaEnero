package edu.es.eoi.ui;

import java.util.Collection;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.entity.Recipe;

public class RecipesListView {
	
	public static void printAllRecipes(Collection<Recipe> recipes) {
		
		for (Recipe recipe : recipes) {
			System.out.println("Receta: " + recipe.getRecipeName());
			System.out.println("comentarios: " + recipe.getComments());
			System.out.println("valoracion: " + recipe.getComments());
			System.out.println("Ingredientes: ");
			System.out.println("************************************");
			
			for (Ingredient	ingredient : recipe.getIngredients()) {
				System.out.println("Ingrediente: ");
				System.out.println("nombre: " + ingredient.getName());			
				System.out.println("precio: "+ingredient.getPrice()+" EUR");
			}
		}
	}

}
