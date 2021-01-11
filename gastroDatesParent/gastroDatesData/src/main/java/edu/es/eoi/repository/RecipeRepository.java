package edu.es.eoi.repository;

import java.util.Collection;

import edu.es.eoi.entity.Recipe;

public interface RecipeRepository extends CrudInterface<Recipe, String>{
	
	public Collection<Recipe> readAll();

}
