package com.qa.stringMethods;

public class StringTasksBetter {

	// Main
	public static void main(String[] args) {
		taskOne("I really love being gay");
		taskTwo("I reall love being gay");
	}

	//Task One
	public static void taskOne(String message) {
		System.out.println("Your message is " + message.length() + " characters long.\n");
	}
	
	
	//Task Two - All
	public static void taskTwo(String message) {
		totalWords(message);
		printVertical(message);
		reverseVertical(message);
	}
	
	// Task Two - P1
	public static void totalWords(String message) {
		Integer count = 1;
		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i+1).equals(" ")) {
				count += 1;
			}
		}
		System.out.println("Your message is " + count + " words long.\n");
	}

	// Task Two - P2
	public static void printVertical(String message) {
		String word = "";

		for (int i = 0; i < message.length(); i++) {
			if (message.substring(i, i + 1).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word += message.substring(i, i + 1);
			}
		}
		System.out.println(word);
		System.out.println("");
	}
	
	//Task Two - P3
	public static void reverseVertical(String message) {
		String word = "";
		
		for (int i = message.length(); i >0; i--) {
			if (message.substring(i-1, i).equals(" ")) {
				System.out.println(word);
				word = "";
			} else {
				word = message.substring(i-1, i) + word;
			}
		}
		System.out.println(word);
	}
}
