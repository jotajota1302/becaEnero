package edu.es.eoi.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Message {
	
	private int id;
	private User origin;
	private User destination;
	private String message;
	private Date date;
	private boolean readed;

}
