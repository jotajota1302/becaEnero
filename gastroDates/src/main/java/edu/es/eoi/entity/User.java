package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import edu.es.eoi.enums.Gender;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
public class User extends Person {
		
	@Column
	private String username;	
	@Column
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
