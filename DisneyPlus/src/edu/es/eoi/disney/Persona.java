package edu.es.eoi.disney;

public class Persona {

	private String nombre;

	private String apellidos;

	private String bod;

	
	public Persona(String nombre, String apellidos, String bod) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.bod = bod;
	}

	public void subscribirse() {

		System.out.println("la persona se subscribe");
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getBod() {
		return bod;
	}

	public void setBod(String bod) {
		this.bod = bod;
	}
	
	

}
