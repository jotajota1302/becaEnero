package edu.es.eoi.entity;

import edu.es.eoi.enums.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends Person {
		

	private String username;	
	private String password;	
	private String mail;	
	private Gender gender;
	private String address;
	private String phoneNumber;	
	private Recipe recipe;	
	private Profile profile;
	
	@Override
	public String toString() {
		return super.getName();
	}
	
	

}
