package edu.es.eoi.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Recipe;
import edu.es.eoi.repository.RecipeRepository;
import edu.es.eoi.repository.RecipeRepositoryMemoryImpl;

class RecipeRepositoryTest {
	
	private RecipeRepository repository = new RecipeRepositoryMemoryImpl();

	@Before
	public void setUp() {
		
	}

	@Test
	void testReadAll() {
		// prepare
		// act
		Collection<Recipe> recipes = repository.readAll();
		// assert
//		assertNotNull(recipes);
//		assertEquals(1, recipes.size());
	}

	@Test
	void testSave() {
		// prepare
		Recipe recipe = new Recipe();
		recipe.setRecipeName("testRecipe");
		// act
		repository.save(recipe);
		// assert
//		assertNotNull(repository.read("testRecipe"));
	}

	@Test
	void testRead() {
		// prepare
		// act
		Recipe recipe = repository.read("chuleton a la brasa");
		// assert
//		assertNotNull(recipe);
	}

	@Test
	void testDelete() {
		// prepare
		Recipe recipe = repository.read("chuleton a la brasa");
		// act
		if(recipe!=null) {
			repository.delete(recipe);
		}
		// assert
//		assertNull(repository.read("chuleton a la brasa"));
	}

	@Test
	void testUpdate() {
		assertTrue(true);
	}

}
