package edu.es.eoi.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Message {

	private int id;
	private User origin;
	private User destination;
	private String message;
	private Date date;
	private boolean readed;

	@Override
	public String toString() {
		return message + " de:" + origin.getName() + " para:" + destination.getName() + " a las: " + date;
	}

}
