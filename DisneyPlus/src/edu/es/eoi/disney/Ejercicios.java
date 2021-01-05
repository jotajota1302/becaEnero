package edu.es.eoi.disney;

public class Ejercicios {

	static String[][] nombresGolosinas = {
			{ "KitKat", "Chicles de fresa", "Lacasitos", "Palotes" },
			{ "Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix" },
			{ "Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta" },
			{ "Lacasitos", "Crunch", "Milkybar", "KitKat" }

	};

	static double[][] precio = {
			{ 1.1, 0.8, 1.5, 0.9 },
			{ 1.8, 1, 1.2, 1 },
			{ 1.8, 1.3, 1.2, 0.8 },
			{ 1.5, 1.1, 1.1, 1.1 }

	};
	
	static double[][] cantidad = {
			{ 1, 2, 4, 1 },
			{ 1, 2, 4, 1 },
			{ 1, 2, 4, 1 },
			{ 1, 2, 4, 1 },

	};


	public static void main(String[] args) {

		System.out.println(comprarGolosina("12",1));
		System.out.println(comprarGolosina("32",1));
		
	}
	
	public static String comprarGolosina(String posicion,int numero) {
		
		int x=Integer.valueOf(posicion.substring(0,1));
		int y=Integer.valueOf(posicion.substring(1,2));
		
		String golosina=nombresGolosinas[x][y];
		
		double coste=precio[x][y];
		
		double total=cantidad[x][y]-numero;
		
		return "Has comprado: " + golosina +", y cuesta: "+ coste +", me quedan: " + total;
	}

}
