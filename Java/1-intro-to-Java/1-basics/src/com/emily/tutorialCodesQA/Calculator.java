package com.emily.tutorialCodesQA;
import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		first();
		second();
		third();
		fourth();
		method();
		calc();
	}
	
	public static int first() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int first = scan.nextInt();
		return first;
		}
	public static int second() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your second number");
		int second = scan.nextInt();
		return second;
		}
	public static int third() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your third number");
		int third = scan.nextInt();
		return third;
		}
	public static int fourth() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your final number");
		int fourth = scan.nextInt();
		return fourth;
		}
	public static String method() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you wish you add (+), subtract (-), multiply (*), or divide (/)|");
		String method = scan.nextLine();
		return method;
	}
	public static int calc() {
		if (meth = '+') {
			return (first + second + third + forth);
		}
		}
}
