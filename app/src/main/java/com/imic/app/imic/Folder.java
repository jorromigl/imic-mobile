package com.imic.app.imic;
import java.util.Collection;
import java.util.HashSet;





public class Folder extends DomainEntity{
	
	private String name;
	
	
	public Folder(){
		super();
		
		messages= new HashSet<Message>();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	private Actor actor;
	private Collection<Message> messages;
	

	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	

	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	
	public void addMessage(Message message) {
		messages.add(message);
		message.setFolder(this);
	
	}
	
	public void removeMessage(Message message) {
		messages.remove(message);
		message.setFolder(null);
	
	}
	
}
