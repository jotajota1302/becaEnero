package edu.es.eoi.disney;

import java.util.ArrayList;
import java.util.List;

public abstract class Media {

	protected String titulo;
	
	protected Double duracion;

	protected String year;
	
	protected CategoriaEnum categoria;
	
	protected Double valoracion;

	protected Director director;	

	protected List<Actor> actores= new ArrayList<Actor>();
	
	public Media(String titulo, Double duracion, String year, CategoriaEnum categoria) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.year = year;
		this.categoria = categoria;
	}
}
