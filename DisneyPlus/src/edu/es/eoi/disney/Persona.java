package edu.es.eoi.disney;

public class Persona {

	private String nombre;

	private String apellidos;

	private String bod;

	private String nif;

	public Persona(String nombre, String apellidos, String bod, String nif) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.bod = bod;
		this.nif = nif;
	}
	
	

	public Persona() {		
	}



	public void subscribirse() {
		System.out.println("la persona se subscribe");

	}
	
	

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getBod() {
		return bod;
	}

	public String getNif() {
		return nif;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((bod == null) ? 0 : bod.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (bod == null) {
			if (other.bod != null)
				return false;
		} else if (!bod.equals(other.bod))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
}
