package edu.es.eoi.disney;

public abstract class Empleado implements Plusable {
	
	public static final double PLUS=300.0;

	private String nombre;	
	private int edad;
	private double salario;	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
