package edu.es.eoi.ui;

import edu.es.eoi.main.MainApp;

public class MainMenu {

	public static void printMenuMain() {

		System.out.println("Bienvenido: " + MainApp.user.getName() + " al menu prencipal de GastroDates");
		System.out.println("Elige una opcion: ");
		System.out.println("1-Publicar Receta: ");
		System.out.println("2-Buscar Recetas: ");
		System.out.println("3-Buscar Match: ");
		System.out.println("4-Chatear con mis matches: ");
	}

}
