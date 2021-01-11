package edu.es.eoi.repository;

import java.util.Collection;

import edu.es.eoi.entity.Recipe;

public class RecipeRepositoryMemoryImpl implements RecipeRepository {

	@Override
	public void save(Recipe e) {		

	}

	@Override
	public Recipe read(String sf) {
		return null;
	}

	@Override
	public void delete(Recipe e) {
	

	}

	@Override
	public Recipe update(Recipe e) {		
		return e;
	}

	@Override
	public  Collection<Recipe> readAll() {		
		return null;
	}

}
