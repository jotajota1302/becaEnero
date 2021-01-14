package edu.es.eoi.ui;

import java.util.Scanner;

import edu.es.eoi.controller.ChatController;
import edu.es.eoi.controller.LoginController;
import edu.es.eoi.controller.RecipeController;
import edu.es.eoi.main.GastroDatesMainApp;

public class MainMenu {
	
	public static void printMenuMain() {

		System.out.println("Bienvenido: " + GastroDatesMainApp.user.getName() + " al menu principal de GastroDates");
		System.out.println("Elige una opcion: ");
		System.out.println("1-Publicar Receta: ");
		System.out.println("2-Ver Recetas: ");
		System.out.println("3-Buscar Match: ");
		System.out.println("4-Leer Mensajes: ");
		System.out.println("5-Logout ");
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		int opcion=scanner.nextInt();		
		
		switch (opcion) {
		case 2:			
			RecipeController recipeController= new RecipeController();
			recipeController.readAll();			
			break;
		case 4:			
			ChatController chatController= new ChatController();
			chatController.readMessagesByUsernameAndReaded(GastroDatesMainApp.user.getUsername(), false);
			break;
		case 5:			
			LoginController loginController= new LoginController();
			loginController.logout();		
			break;

		default:
			break;
		}
	}

}
