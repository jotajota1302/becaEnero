package edu.es.eoi.service;

import java.util.Collection;

import edu.es.eoi.entity.Recipe;
import edu.es.eoi.repository.RecipeRepository;
import edu.es.eoi.repository.RecipeRepositoryMemoryImpl;

public class RecipeServiceImpl implements RecipeService {

	@Override
	public Collection<Recipe> readAll() {

		RecipeRepository repository= new RecipeRepositoryMemoryImpl();
		return repository.readAll();		
		
	}

}
