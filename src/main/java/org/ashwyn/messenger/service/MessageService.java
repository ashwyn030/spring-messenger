package org.ashwyn.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ashwyn.messenger.database.DatabaseClass;
import org.ashwyn.messenger.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages=DatabaseClass.getMessages();
	
	public MessageService() {
		super();
		this.messages.put(1L, new Message(1, "Hello World", "ashwyn"));
		this.messages.put(2L, new Message(2, "Hello Jersey", "manoj")); 
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(this.messages.values());

	}

	public Message getMessage(long id) {
		return this.messages.get(id);

	}

	public Message addMessage(Message message) {
		message.setId(this.messages.size()+1);
		return this.messages.put(message.getId(), message);

	}

	public Message updateMessage(Message message) {
		return this.messages.put(message.getId(), message);

	}

	public Message deleteMessage(long id) {
		return this.messages.remove(id);

	}

}
