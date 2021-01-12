package edu.es.eoi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.es.eoi.repository.RecipeRepository;
import edu.es.eoi.repository.RecipeRepositoryJDBCImpl;

class RecipeRepositoryJDBCImplTest {

	@Test
	void testRead() {
		
		RecipeRepository repository= new RecipeRepositoryJDBCImpl();
		
		assertEquals(1,repository.read("chuleton a la brasa").getId());
	
		
	}

}
