package edu.es.eoi.entity;

import java.util.List;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Recipe {

	private String recipeName;
	private String description;
	private String photo;
	private Set<Ingredient> ingredients;
	private double valoration;
	private List<String> comments;
	
}
