package com.qa.calculator;

import java.util.Scanner;

public class Calculator {

	Integer x;
	Integer y;
	String z;
	Integer answer;
	String result;

	public void user() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your first number\n>> ");
		x = scan.nextInt();
		System.out.print("\nThank you.\nPlease enter your second number\n>> ");
		y = scan.nextInt();
		System.out.print("\nThank you.\nPlease chose either add (a), subtract (s), multiply (m), or divide (d)\n>>");
		scan.nextLine();
		z = scan.nextLine();
		System.out.print("\nThank you. Calculating your answer...\n");
		scan.close();

		switch (z) {
		case "a":
			System.out.print("\n" + x + " + " + y + " = " + addXY(x, y)); 
			break;
		case "s":
			System.out.print("\n" + x + " - " + y + " = " + subXY(x, y));
			break;
		case "m":
			System.out.print("\n" + x + " * " + y + " = " + mulXY(x, y));
			break;
		case "d":
			if (y == 0) {
				System.out.print("\nYou cannot divide by zero. Please try again.\n>> ");
			}
			System.out.print("\n" + x + " / " + y + " = " + divXY(x, y));
			break;
		default:
			System.out.print("\nPlease only chose from 'a' for add, 's' for subtract, 'm' for multiply, or 'd' fr divide\n>> ");
			break;
		}
	}

	public Integer getX() {
		return x;
	}

	public Integer getY() {
		return y;
	}

	public String getZ() {
		return z;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(String z) {
		this.z = z;
	}

	public int addXY(int x, int y) {
		answer = (x + y);
		return answer;
	}

	public int subXY(int x, int y) {
		answer = (x - y);
		return answer;
	}

	public int mulXY(int x, int y) {
		answer = (x * y);
		return answer;
	}

	public int divXY(int x, int y) {
		answer = (x / y);
		return answer;
	}

}
