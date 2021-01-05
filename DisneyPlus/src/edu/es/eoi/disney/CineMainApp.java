package edu.es.eoi.disney;

import java.util.Map;
import java.util.TreeMap;

public class CineMainApp {

	public static void main(String[] args) {

		Cine cine = crearSesionCine();

		Map<String, Persona> butacas = new TreeMap<String, Persona>();

		generarKeySetButacas(butacas);

		cine.setButacas(butacas);

		// mi cine con mis butacas
		System.out.println(butacas);
		
		//metodo generar y sentar personas
	

	}

	private static Cine crearSesionCine() {

		Cine cine = new Cine();
		cine.setPelicula(new Pelicula("La Jungla de Cristal 1", 120.0, "1985", CategoriaEnum.ACCION));
		cine.setPrecioEntrada(5.0);

		return cine;
	}

	private static void generarKeySetButacas(Map<String, Persona> butacas) {

		for (int i = 1; i < 9; i++) {
			String letra = "ABCDEFGH";
			for (int j = 0; j < 8; j++) {
				String butaca = String.valueOf(i).concat(letra.substring(j, j + 1));
				butacas.put(butaca, null);
			}
		}
	}

}
