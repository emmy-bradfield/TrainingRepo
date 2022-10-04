package com.qa.openclosed;

public abstract class Greeter implements Speech{
	
	public static void sayHello(Speech type) {
		System.out.println(type.sayGreeting());
	}

}
