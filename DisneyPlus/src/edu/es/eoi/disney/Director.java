package edu.es.eoi.disney;

public class Director extends Persona {
	
	public Director(String nombre, String apellidos, String bod) {
		super(nombre, apellidos, bod,"");		
	}

	public void dirigir() {
		
		System.out.println("estoy dirigiendo");
		
	}

}
