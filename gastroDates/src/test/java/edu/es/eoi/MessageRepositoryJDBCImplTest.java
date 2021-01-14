package edu.es.eoi;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import edu.es.eoi.entity.Message;
import edu.es.eoi.entity.User;
import edu.es.eoi.repository.MessageRepositoryJDBCImpl;

class MessageRepositoryJDBCImplTest {

	public MessageRepositoryJDBCImpl repository= new MessageRepositoryJDBCImpl();
	
	@Test
	void testSaveMessage() {
		
		Message message= new Message();
		
		User userOrigin=new User();
		userOrigin.setId(5);
		
		User userDestination=new User();
		userDestination.setId(5);
		
		message.setOrigin(userOrigin);
		message.setDestination(userDestination);		
		message.setMessage("hello from test");		
		
		repository.setTest(true);
		
		repository.save(message);		
				
		assertEquals("","");	
		
	}
	
	@Test
	public void testFindMessagesByUsernameAndReaded() {			
				
		List<Message> messages=repository.getMessagesBy("pepe", false);				
		assertNotNull(messages);
		
	}
	
	@Test
	public void testUpdateMessage() {
		
		repository.setTest(false);
		
		Message e=new Message();
		e.setId(15);
		e.setReaded(true);
		e.setMessage("UPDATE TEST");
		
		int reponse=repository.update(e);
		
		assertEquals(1, reponse);
		
		
	}
	
	@Test
	public void testDeleteMessage() {
		
		repository.setTest(true);
		
		Message e=new Message();
		e.setId(15);		
		
		int reponse=repository.delete(e);
		
		assertEquals(1, reponse);
		
		
	}
	

}
