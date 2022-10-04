package com.qa.calculator;

public class Answer extends Calculator{
	
	Integer x;
	Integer y;
	String z;
	Integer answer;
	String result;
	
	public Answer() {};
	
	public Answer(int x, int y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void action() {
		user();
	}
	
}
