package edu.es.eoi.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class Person {
		
	@Id
	private int id;
	
	@Column
	private String name;
	
	@Column	
	private String surname;	
	

	
}
