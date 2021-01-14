package edu.es.eoi.ui;

import java.util.Scanner;

import edu.es.eoi.controller.LoginController;
import edu.es.eoi.main.GastroDatesMainApp;

@SuppressWarnings("resource")
public class LoginMenu {
	
	public static void printMenuLogin() {
		
		LoginController controller= new LoginController();
		
		System.out.println("Bienvenido al menu Login de: " + GastroDatesMainApp.properties.getProperty("application.name"));
		System.out.println("****************************************");
		System.out.println("Introduzca usuario: ");
	
		Scanner scanner=new Scanner(System.in);
		String user=scanner.nextLine();
		System.out.println("Introduzca paswword: ");
		scanner=new Scanner(System.in);
		String password=scanner.nextLine();			
		
		controller.login(user, password);		
		
	}

}
