package edu.es.eoi.repository;

import edu.es.eoi.entity.Person;

public class PersonRepositoryMemoryImpl implements PersonRepository {
	
	
	@Override
	public void save(Person e) {
		
	}

	@Override
	public Person read(String sf) {
		return null;
	}

	@Override
	public void delete(Person e) {
		
	}

	@Override
	public Person update(Person e) {
		return e;
	}

}
