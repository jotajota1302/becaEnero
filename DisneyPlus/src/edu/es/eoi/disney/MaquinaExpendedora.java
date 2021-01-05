package edu.es.eoi.disney;

import java.util.HashMap;
import java.util.Map;

public class MaquinaExpendedora {
	
	private Map<String,Producto> productos=new HashMap<String, Producto>();
	
	public void comprar(String posicion,int numero) {
		
		if(numero>productos.get(posicion).getCantidad()) {
			System.out.println("no me quedan llamar al reponedor");
		}else {
			productos.get(posicion).setCantidad(productos.get(posicion).getCantidad()-numero);
			System.out.println("producto comprado: " + productos.get(posicion).getNombre());
		}		
	}

	public Map<String, Producto> getProductos() {
		return productos;
	}

	public void setProductos(Map<String, Producto> productos) {
		this.productos = productos;
	}



}
