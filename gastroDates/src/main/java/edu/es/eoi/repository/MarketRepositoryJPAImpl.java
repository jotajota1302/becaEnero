package edu.es.eoi.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Market;

public class MarketRepositoryJPAImpl {
	
	static EntityManager manager= Persistence.createEntityManagerFactory("APP_PERSISTENCE_UNIT").createEntityManager();	

	@SuppressWarnings("unchecked")
	public List<Market> readAll(){
		
		Query query=manager.createQuery("from Market");
		
		return query.getResultList();
		
	}
	
}
