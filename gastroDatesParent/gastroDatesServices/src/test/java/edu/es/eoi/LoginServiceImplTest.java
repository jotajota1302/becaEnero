package edu.es.eoi;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Person;
import edu.es.eoi.entity.User;
import edu.es.eoi.service.LoginServiceImpl;

import static org.junit.Assert.*;

class LoginServiceImplTest {

	@Test
	void testChangeUsername() {
		
		LoginServiceImpl service= new LoginServiceImpl();		
		Person user= new User();
		user.setName("test");
		
		Person user2=service.changeUsername(user,"TEST");
		
		assertEquals("TEST", user2.getName());		
		
	}

}
