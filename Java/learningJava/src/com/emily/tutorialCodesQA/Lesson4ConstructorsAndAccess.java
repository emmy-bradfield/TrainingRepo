package com.emily.tutorialCodesQA;

public class Lesson4ConstructorsAndAccess {
	private String name;
	private String pathway;
	
	public Lesson4ConstructorsAndAccess(String name, String pathway) {
		this.name = name;
		this.pathway = pathway;
	}
	
	public static void main(String[] args) {
		Lesson4ConstructorsAndAccess Bob = new Lesson4ConstructorsAndAccess("Bob", "Software Development");
	}
}
