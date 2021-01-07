package edu.es.eoi.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profile {
	
	private String profileName;
	private String description;
	private String photo;
	
	private List<Recipe> preferedRecipes;

}
