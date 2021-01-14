package edu.es.eoi;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Ingredient;
import edu.es.eoi.repository.IngredientRepositoryJPAImpl;

class IngredientRepositoryJPAImplTest {

	@Test
	void testRead() {
		
		IngredientRepositoryJPAImpl repository= new IngredientRepositoryJPAImpl();
		
		Ingredient ingredient=repository.read(1);
		
		assertEquals("PATATA", ingredient.getName());
		
	}
	
	@Test
	void testReadByName() {
		
		IngredientRepositoryJPAImpl repository= new IngredientRepositoryJPAImpl();
		
		Ingredient ingredient=repository.readByName("PATATA");
		
		assertEquals(1, ingredient.getId());
		
	}
	
	@Test
	void testSaveAndDelete() {
		
		IngredientRepositoryJPAImpl repository= new IngredientRepositoryJPAImpl();
		
		Ingredient ingredient=new Ingredient();
		ingredient.setName("INGREDIENTE TEST");
		ingredient.setPrice(100);
		
		ingredient=repository.save(ingredient);
		
		assertNotEquals(0,ingredient.getId());
		
		repository.delete(ingredient);
		
	}	
	

}
