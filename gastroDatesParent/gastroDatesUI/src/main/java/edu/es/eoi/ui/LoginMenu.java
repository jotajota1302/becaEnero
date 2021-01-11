package edu.es.eoi.ui;

import java.util.Scanner;

import edu.es.eoi.controller.LoginController;
import edu.es.eoi.main.MainApp;

@SuppressWarnings("resource")
public class LoginMenu {
	
	public static void printMenuLogin() {
		
		LoginController controller= new LoginController();
		
		System.out.println("Bienvenido al menu Login de: " + MainApp.properties.getProperty("application.name"));
		System.out.println("****************************************");
		System.out.println("Introduzca usuario: ");
	
		Scanner scanner=new Scanner(System.in);
		String user=scanner.nextLine();
		System.out.println("Introduzca paswword: ");
		scanner=new Scanner(System.in);
		String password=scanner.nextLine();			
		
		try {
			controller.login(user, password);
		} catch (Exception e) {			
			System.out.println("Error en la longitud minima del password");
			printMenuLogin();
		}		
		
	}

}
