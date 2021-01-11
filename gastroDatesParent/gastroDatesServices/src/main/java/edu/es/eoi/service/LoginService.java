package edu.es.eoi.service;

import edu.es.eoi.entity.User;

public interface LoginService {
	
	public User login(String user,String password);

}
