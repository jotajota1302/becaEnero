package edu.es.eoi.service;

import java.util.List;

import edu.es.eoi.entity.Message;
import edu.es.eoi.entity.User;

public interface ChatService {
	
	public void sendMessage(User origin,User destination,String message);
	
	public List<Message> readMessagesByUsernameAndReaded(User user,Boolean readed);

	public void updateMessage(Message message);
	
}
