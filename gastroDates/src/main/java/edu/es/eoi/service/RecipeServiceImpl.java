package edu.es.eoi.service;

import java.util.Collection;

import edu.es.eoi.entity.Recipe;
import edu.es.eoi.repository.RecipeRepository;
import edu.es.eoi.repository.RecipeRepositoryJDBCImpl;

public class RecipeServiceImpl implements RecipeService {

	@Override
	public Collection<Recipe> readAll() {

		RecipeRepository repository= new RecipeRepositoryJDBCImpl();
		return repository.readAll();		
		
	}

}
