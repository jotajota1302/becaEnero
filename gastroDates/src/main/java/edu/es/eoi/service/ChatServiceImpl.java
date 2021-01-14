package edu.es.eoi.service;

import java.util.List;

import edu.es.eoi.entity.Message;
import edu.es.eoi.entity.User;
import edu.es.eoi.repository.MessageRepository;
import edu.es.eoi.repository.MessageRepositoryJDBCImpl;

public class ChatServiceImpl implements ChatService {

	private MessageRepository repository= new MessageRepositoryJDBCImpl();
	
	@Override
	public void sendMessage(User origin, User destination, String message) {
		
		Message mess= new Message();
		mess.setMessage(message);	
		mess.setOrigin(origin);
		mess.setOrigin(destination);
		
		repository.save(mess);

	}

	@Override
	public List<Message> readMessagesByUsernameAndReaded(User user, Boolean readed) {
		
		return repository.getMessagesBy(user.getName(),readed);
		
	}

	@Override
	public void updateMessage(Message message) {
		
		repository.update(message);
		
	}

}
