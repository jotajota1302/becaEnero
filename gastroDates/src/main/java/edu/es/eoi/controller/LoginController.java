package edu.es.eoi.controller;

import org.apache.log4j.Logger;

import edu.es.eoi.entity.User;
import edu.es.eoi.main.MainApp;
import edu.es.eoi.service.LoginService;
import edu.es.eoi.service.LoginServiceImpl;
import edu.es.eoi.ui.LoginMenu;
import edu.es.eoi.ui.MainMenu;

public class LoginController {	
	
	private Logger logger=Logger.getLogger(LoginController.class);
	
	public void login(String user,String password) throws Exception {
		
		logger.debug("parametros: user: " + user+", pwd: "+ password);
		
		if(password.length()<=4) {
			throw new Exception("Formato de password incorrecto");
		}
	
		LoginService service= new LoginServiceImpl();	
		User entity=service.login(user, password);
		
		if(entity!=null) {
			MainApp.user=entity;
			MainMenu.printMenuMain();
		}else {
			System.out.println("usuario no encontrado");
			LoginMenu.printMenuLogin();
		}
	}
	
	public void logout() {	
		MainApp.user=null;
		LoginMenu.printMenuLogin();		
	}

}
