package edu.es.eoi.disney;

public class EmpresaMain {

	public static void main(String[] args) {

		Empleado empleado1 = new Comercial("Pepe", 250.0);

		Empleado empleado2 = new Repartidor("Juan", "zona 1");
		
		System.out.println(aplicaPlus(empleado1));
		System.out.println(aplicaPlus(empleado2));
	
	}

	public static boolean aplicaPlus(Empleado empleado) {

		return empleado.calcularPlus();

	}

}
