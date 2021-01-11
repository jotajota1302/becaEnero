package edu.es.eoi.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Person;
import edu.es.eoi.repository.PersonRepository;
import edu.es.eoi.repository.PersonRepositoryExcelImpl;

class PersonRepositoryExcelImplTest {	
	
	@Test
	void testRead() {
		
		PersonRepository repository= new PersonRepositoryExcelImpl();
		Person user=repository.read("pepe");		
		assertEquals("Pepe", user.getName());
		
	}

}
