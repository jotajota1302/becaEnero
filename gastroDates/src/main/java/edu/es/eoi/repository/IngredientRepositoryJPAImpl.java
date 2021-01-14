package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Ingredient;

public class IngredientRepositoryJPAImpl {

	static EntityManager manager= Persistence.createEntityManagerFactory("APP_PERSISTENCE_UNIT").createEntityManager();	
		
	public Ingredient read(int id) {
		
		return manager.find(Ingredient.class, 1);
		
	}
	
	public Ingredient readByName(String name) {
		
		Query query=manager.createQuery("from Ingredient i where i.name=? ");
		query.setParameter(1, name);
				
		return (Ingredient) query.getSingleResult();
	}
	
	public Ingredient save(Ingredient ingredient) {
		
		manager.getTransaction().begin();
		
		ingredient=manager.merge(ingredient);
		
		manager.getTransaction().commit();
		
		return ingredient ;
		
	}
	
	public void delete(Ingredient ingredient) {
		
		manager.getTransaction().begin();
		
		manager.remove(ingredient);
		
		manager.getTransaction().commit();
	}

	
}
