package edu.es.eoi.entity;

import java.util.List;

import edu.es.eoi.enums.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends Person {
	
	private String username;
	private String password;
	private Gender gender;
	private String address;
	private String phoneNumbers;
	private String mail;
	private List<Recipe> recipes;
	
	private Profile profile;
	

}
