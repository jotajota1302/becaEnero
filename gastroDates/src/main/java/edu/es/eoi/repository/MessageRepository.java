package edu.es.eoi.repository;

import java.util.List;

import edu.es.eoi.entity.Message;

public interface MessageRepository{

	void save(Message e);

	List<Message> getMessagesBy(String username, Boolean read);

}
