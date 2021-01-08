package edu.es.eoi.main;

import java.util.HashMap;
import java.util.Map;

import edu.es.eoi.entity.User;
import edu.es.eoi.ui.LoginMenu;

public class MainApp {
	
	public static Map<String, User> users=new HashMap<String, User>();		
	public static User user;

	public static void main(String[] args) {
		
		initUsers();
		
		//arrancar mi UI
		LoginMenu.printMenuLogin();		
	
	}

	private static void initUsers() {
		
		User person= new User();
		person.setName("Pepe");
		person.setSurname("Palotes");
		person.setUsername("pepeKitchenLover");
		person.setPassword("password");
				
		users.put(person.getUsername(), person);
		
		person= new User();
		person.setName("Marta");
		person.setSurname("Martinez");
		person.setUsername("hummusLover");
		person.setPassword("password");
		
		users.put(person.getUsername(), person);
	}

}
