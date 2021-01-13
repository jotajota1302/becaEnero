package edu.es.eoi.controller;

import java.util.List;

import edu.es.eoi.entity.Message;
import edu.es.eoi.entity.User;
import edu.es.eoi.service.ChatService;
import edu.es.eoi.service.ChatServiceImpl;
import edu.es.eoi.service.PersonService;
import edu.es.eoi.service.PersonServiceImpl;
import edu.es.eoi.ui.MainMenu;
import edu.es.eoi.ui.MessagesView;

public class ChatController {
	
	private ChatService chatService= new ChatServiceImpl();
	private PersonService personService= new PersonServiceImpl();
	
	public void sendMessage(String from,String to,String message) {
		
		User origin=(User) personService.findByUsername(from);
		User destination=(User) personService.findByUsername(to);
		
		chatService.sendMessage(origin, destination, message);
		
	}
	
	public void readMessagesByUsernameAndReaded(String username,Boolean readed){
		
		User user=(User) personService.findByUsername(username);
				
		List<Message> messages=chatService.readMessagesByUsernameAndReaded(user, readed);
		
		MessagesView.printMessages(messages);
		
		MainMenu.printMenuMain();
	}

}
