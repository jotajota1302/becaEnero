package edu.es.eoi.service;

import edu.es.eoi.entity.User;
import edu.es.eoi.repository.PersonRepository;
import edu.es.eoi.repository.PersonRepositoryExcelImpl;

public class LoginServiceImpl implements LoginService {

	@Override
	public User login(String user, String password) {

		PersonRepository repository= new PersonRepositoryExcelImpl();
		
		User entity=(User) repository.read(user);
		
		if(entity!=null&&entity.getPassword().equals(password)) {
			return entity;
		} else {
			return null;
		}
	}

}
