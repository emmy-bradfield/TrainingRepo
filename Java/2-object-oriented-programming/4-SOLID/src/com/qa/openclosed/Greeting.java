package com.qa.openclosed;

public class Greeting implements Speech{

	private String message;
	
	@Override
	public String sayGreeting() {
		message = "Hello";
		return message;
	}

}
