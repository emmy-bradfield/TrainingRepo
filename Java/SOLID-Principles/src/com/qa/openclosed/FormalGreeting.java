package com.qa.openclosed;

public class FormalGreeting implements Speech{
	
	private String message;

	@Override
	public String sayGreeting() {
		message = "Good evening, sir";
		return message;
	}

}
