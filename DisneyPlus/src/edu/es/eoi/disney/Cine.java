package edu.es.eoi.disney;

import java.util.Map;

public class Cine {
	
	private Pelicula pelicula;
	
	private double precioEntrada;
	
	private Map<String, Persona> butacas;

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public Map<String, Persona> getButacas() {
		return butacas;
	}

	public void setButacas(Map<String, Persona> butacas) {
		this.butacas = butacas;
	}
	 
	

}
