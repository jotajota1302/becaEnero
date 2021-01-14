package edu.es.eoi.repository;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.es.eoi.entity.Person;
import edu.es.eoi.entity.User;

public class PersonRepositoryJPAImpl implements PersonRepository{

	static EntityManager manager= Persistence.createEntityManagerFactory("APP_PERSISTENCE_UNIT").createEntityManager();	
		
	@Override
	public void save(Person e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person read(String sf) {
			
		Query queryNative = manager.createNativeQuery("SELECT u.id,u.username,u.password,u.name,u.surname FROM user u WHERE u.username=?");
		queryNative.setParameter(1, sf);
		
		Object user = queryNative.getSingleResult();
		System.out.println(user);
		
		Query query=manager.createQuery("from User u where u.name=?");
		query.setParameter(1, sf);
		
		User entity=(User) query.getSingleResult();
		
		return entity;
		
	}

	@Override
	public void delete(Person e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person update(Person e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
