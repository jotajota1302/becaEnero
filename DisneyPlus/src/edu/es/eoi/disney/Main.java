package edu.es.eoi.disney;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {	
	
	public static MaquinaExpendedora maquina;

	public static void main(String[] args) {			
				
		reponerMaquina(new ArrayList<Producto>());
		
		if(null==maquina||maquina.getProductos().isEmpty()) {
			encenderMaquina();		
		}			
		maquina.comprar("02",1);	
		maquina.comprar("03",1);	
		maquina.comprar("02",1);	
		maquina.comprar("03",1);			
		
		double numero = Math.round(Math.random()*64);
		
		Random aleatorio= new Random(64);
		
		int asiento=aleatorio.nextInt();
		
	}
	
	public static void encenderMaquina() {
	
		//crea los objetos iniciales
		maquina=new MaquinaExpendedora();
		maquina.getProductos().put("21",new Producto("Kinder Bueno", 1.8, 4));	
		maquina.getProductos().put("02",new Producto("Milkybar", 1.1, 2));
		maquina.getProductos().put("03",new Producto("Chetoos", 1.2,3));
		
	}

	public static void reponerMaquina(List<Producto> productos) {
		
		//reponer maquina

		
	}
	
}
