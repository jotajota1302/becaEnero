package edu.es.eoi.ui;

import java.util.List;

import edu.es.eoi.entity.Message;

public class MessagesView {
	
	
	public static void printMessages(List<Message> messages) {
		
		messages.stream().forEach(System.out::println);
		
		
	}
	
	public static void sendMessage() {
		
		//vista de scanner y pedir a info a usuario
		
		
	}

}
