package edu.es.eoi.disney;

public class Comercial extends Empleado {

	private double comision;

	public double getComision() {
		return comision;
	}
		
	public Comercial(String name,double comision) {
		super();
		this.setNombre(name);
		this.comision = comision;
		this.setSalario(20000);
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public boolean calcularPlus() {

		if (this.getEdad() >= 30 && this.comision >= 200) {		
			
			System.out.println("aplico el plus para el empleado " + this.getClass().getSimpleName());
			System.out.println("Salario inicial: " + this.getSalario());
			
			this.setSalario(this.getSalario() + Empleado.PLUS);
			
			System.out.println("Salario final: " + this.getSalario());
			
			return true;
		} else {
			System.out.println("no aplica el plus para el empleado " + this.getClass().getSimpleName());		
			return false;
		}
	}

}
