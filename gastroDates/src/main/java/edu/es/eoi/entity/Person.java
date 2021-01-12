package edu.es.eoi.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Person {
	
	private int id;
	private String name;
	private String surname;
	private Date birthDate;	
	
}
