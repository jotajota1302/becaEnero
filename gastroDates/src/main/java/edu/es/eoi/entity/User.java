package edu.es.eoi.entity;

import java.util.List;

import edu.es.eoi.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User extends Person {
	
	private String username;
	private String password;
	private String mail;	
	private Gender gender;
	private String address;
	private String phoneNumber;	
	private List<Recipe> recipes;	
	private Profile profile;
	

}
