package edu.es.eoi.disney;

public class Repartidor extends Empleado {

	private String zona;
	
	public Repartidor(String nombre,String zona) {
		super();
		this.setNombre(nombre);
		this.zona = zona;
		this.setSalario(12500);
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public boolean calcularPlus() {

		if (this.getEdad() <= 25 && !this.zona.equals("zona 3")) {
						
			System.out.println("aplico el plus para el empleado " + this.getClass().getSimpleName());
			System.out.println("Salario inicial: " + this.getSalario());
			this.setSalario(this.getSalario() + Empleado.PLUS);
			System.out.println("Salario final: " + this.getSalario());
			
			return true;
		} else {
			System.out.println("no aplica el plus para el empleado" + this.getClass().getSimpleName());		
			return false;
		}
	}

}
