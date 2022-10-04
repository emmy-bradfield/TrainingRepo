package com.qa.conditionsals;

public class CalculatorRevisited {

	public static void main(String[] args) {
		divide(20, 10);

	}
	
	public static void divide(int x, int y) {
		if (x >= y) {
			double result = x / y;
			System.out.println(result);
		} else {
			System.out.println("Your first value must be larger than your second value");
		}
	}

}
