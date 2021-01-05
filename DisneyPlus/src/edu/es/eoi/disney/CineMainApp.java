package edu.es.eoi.disney;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CineMainApp {

	public static void main(String[] args) {

		Cine cine = crearSesionCine();

		Map<String, Persona> butacas = new TreeMap<String, Persona>();

		generarKeySetButacas(butacas);

		cine.setButacas(butacas);
	
		sentarPersonas(cine, butacas);		
		
		int entradas=0;
		for (Persona p : butacas.values()) {
			if(p!=null) {
				entradas=entradas+1;
			}			
		}
		
		System.out.println("He vendido:" + entradas  + " entradas");

	}

	private static void sentarPersonas(Cine cine, Map<String, Persona> butacas) {	

		for (int i = 1; i < 101; i++) {
			Espectador p = new Espectador();
			((Persona) (p)).setNombre("Persona".concat(String.valueOf(i)));
			
			for (String butaca : butacas.keySet()) {
				
				if (butacas.get(butaca) != null) {
//					System.out.println("asiento ocupado");
				}else if(p.getDinero()>= cine.getPrecioEntrada()){
					butacas.put(butaca, p);
					System.out.println(p.getNombre()+" sentado en asiento: " + butaca);
					break;
				}else {
					System.out.println(p.getNombre() + " no tiene suficiente dinero");
					break;
				}
			}

		}
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
