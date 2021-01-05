package edu.es.eoi.disney;

public class Foto implements Imprimible{
	
	String resolucion;

	@Override
	public void imprimir() {
		System.out.println("la foto se imprime con el filtro vintage");
		
	}
	
	

}
