package edu.es.eoi.controller;

import java.util.Calendar;

import org.apache.log4j.Logger;

import edu.es.eoi.entity.User;
import edu.es.eoi.main.GastroDatesMainApp;
import edu.es.eoi.service.LoginService;
import edu.es.eoi.service.LoginServiceImpl;
import edu.es.eoi.ui.LoginMenu;
import edu.es.eoi.ui.MainMenu;

public class LoginController {	
	
	private Logger logger=Logger.getLogger(LoginController.class);
	
	public void login(String user,String password) {
		
		long millisBefore=Calendar.getInstance().getTimeInMillis();
		
		logger.debug("parametros: user: " + user+", pwd: "+ password);
			
		LoginService service= new LoginServiceImpl();	
		User entity=service.login(user, password);
		
		long millisAfter=Calendar.getInstance().getTimeInMillis();
		
		long diff=millisAfter-millisBefore;
		
		logger.debug("El metodo ha tardado: " + diff +" msec");		
		
		if(entity!=null) {
			GastroDatesMainApp.user=entity;
			MainMenu.printMenuMain();
		}else {
			System.out.println("usuario no encontrado");
			LoginMenu.printMenuLogin();
		}
		
		
	}
	
	public void logout() {	
		GastroDatesMainApp.user=null;
		LoginMenu.printMenuLogin();		
	}

}
