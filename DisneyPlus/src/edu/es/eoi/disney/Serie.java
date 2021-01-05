package edu.es.eoi.disney;

import java.util.ArrayList;
import java.util.List;

public class Serie implements Alquilable,Reproducible{	
			
	private String titulo;
	
	private Double duracion;

	private String year;
	
	private CategoriaEnum categoria;
	
	private Double valoracion;

	private Director director;	

	private List<Actor> actores= new ArrayList<Actor>();

	public Serie(String titulo, Double duracion, String year, CategoriaEnum categoria) {
		super();
		this.titulo = titulo;
		this.duracion = duracion;
		this.year = year;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getDuracion() {
		return duracion;
	}

	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}

	public Double getValoracion() {
		return valoracion;
	}

	public void setValoracion(Double valoracion) {
		this.valoracion = valoracion;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	public List<Actor> getActores() {
		return actores;
	}

	public void setActores(List<Actor> actores) {
		this.actores = actores;
	}

	@Override
	public void alquilar( int dias) { 
		if(this.titulo.equals("The Boys 2")) {
			System.out.println("no se puede alquilar");
		}else {
			System.out.println("alquilada");
		}
		
	}

	@Override
	public void reproducir() {
		System.out.println("Estoy reproduciendo la serie: " + this.titulo);		
	}
	
}
