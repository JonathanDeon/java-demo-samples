package com.jonathan.eh.model;

import javax.validation.constraints.Size;

public class Event {
	
	@Size(min=4,max=15, message="Event name should be between 4 - 15 words")
	String eventName;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
}
