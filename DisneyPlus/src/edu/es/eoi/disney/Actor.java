package edu.es.eoi.disney;

public class Actor extends Persona {	
	
	public Actor(String nombre, String apellidos, String bod) {
		super(nombre, apellidos, bod);		
	}

	public void actuar() {

		System.out.println("estoy actuando");

	}

}
