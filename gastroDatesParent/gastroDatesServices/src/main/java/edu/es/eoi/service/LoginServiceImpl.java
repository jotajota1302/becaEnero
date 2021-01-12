package edu.es.eoi.service;

import edu.es.eoi.entity.Person;
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
	
	public Person changeUsername(Person person,String name) {
		
		//logica de servicio particular
		name=name.toLowerCase();
		person.setName(name);
		//invoco repository
		PersonRepositoryExcelImpl repository= new PersonRepositoryExcelImpl();		
		
		return repository.changeName(name);
	}

}
