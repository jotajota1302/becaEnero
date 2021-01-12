package edu.es.eoi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.PersonRepository;
import edu.es.eoi.repository.PersonRepositoryJDBCImpl;

class PersonRepositoryJDBCImplTest {

	@Test
	void testRead() {
		
		PersonRepository repository= new PersonRepositoryJDBCImpl();
		
		assertEquals("Perez",((User)repository.read("pepe")).getSurname());
	
		
	}

}
