package edu.es.eoi.controller;

import edu.es.eoi.service.RecipeService;
import edu.es.eoi.service.RecipeServiceImpl;
import edu.es.eoi.ui.MainMenu;
import edu.es.eoi.ui.RecipesListView;

public class RecipeController {
	
	public void readAll(){		
		
		RecipeService service= new RecipeServiceImpl();		

		RecipesListView.printAllRecipes(service.readAll());
		
		MainMenu.printMenuMain();
		
	}

}
