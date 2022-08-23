package com.qa.calculator;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(add(23, 27));
		System.out.println(subtract(23,27));
		System.out.println(multiply(23, 27));
		System.out.println(divide(23,27));

	}
	
	public static double add(double x, double y) {
		double result = x + y;
		return result;
	}
	
		public static double subtract(double x, double y) {
			double result = x - y;
			return result;
	}
		
		public static double multiply(double x, double y) {
			double result = x * y;
			return result;
	}
		
		public static double divide(double x, double y) {
			double result = x / y;
			return result;
		}
}
