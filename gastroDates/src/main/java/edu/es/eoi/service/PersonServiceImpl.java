package edu.es.eoi.service;

import edu.es.eoi.entity.Person;
import edu.es.eoi.repository.PersonRepository;
import edu.es.eoi.repository.PersonRepositoryJDBCImpl;

public class PersonServiceImpl implements PersonService {

	private PersonRepository repository= new PersonRepositoryJDBCImpl();
	
	@Override
	public Person findByUsername(String username) {

		return repository.read(username);
		
	}

}
