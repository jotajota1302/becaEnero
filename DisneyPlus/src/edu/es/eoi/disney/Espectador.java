package edu.es.eoi.disney;

public class Espectador extends Persona{

	private double dinero;
	
	public Espectador(String nombre, String apellidos, String bod, String nif) {
		super(nombre, apellidos, bod, nif);
		dinero=Math.random()*10;
	}	

	public Espectador() {
		super();
		this.dinero = Math.random()*10;
	}



	public double getDinero() {
		return dinero;
	}

}
