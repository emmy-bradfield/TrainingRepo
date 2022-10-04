package com.qa.scanner;
import java.util.Scanner;

public class ScannerDemoCode {
	
	public static void main(String[] ars) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello there, nice to meet you! What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Well, it's lovely to meet you, " + name + "! And how old are you?");
		Integer age = scan.nextInt();
		scan.nextLine();
		
		System.out.println("That's cool, I wish I was " + age + ". \nOkay, last question and then I'll let you get on with your day..."
				+ "\nWhat is the long number on the front of your credit card, the expirey date, and the security code on the back?");
		String longNumber = scan.nextLine();
		String date = scan.nextLine();
		Integer code = scan.nextInt();
		scan.nextLine();
		
		System.out.println("Thanks, " + name + " you've saved the day!");
		
		scan.close();
	}
	
}
