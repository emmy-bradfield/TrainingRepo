package com.emily.tutorialCodesQA;
import java.util.Scanner;

public class StaffLogin {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your staff ID number");
		int id = scan.nextInt();
		scan.nextLine();
		System.out.println("Please enter your full name");
		String fullName = scan.nextLine();
		
		System.out.println("User: " + id);
		System.out.println("Name " + fullName);
	}
}
