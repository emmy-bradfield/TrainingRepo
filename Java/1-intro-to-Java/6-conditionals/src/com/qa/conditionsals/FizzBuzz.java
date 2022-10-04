package com.qa.conditionsals;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(exercise(15));
	}
	
	public static String exercise(int x) {
		if (x % 3 <= 0 == true && x % 5 <= 0 == true) {
			return "FizzBuzz";
		} else if (x % 3 <= 0 == true) {
			return "Fizz";
		} else if (x % 5 <= 0 == true) {
			return "Buzz";
		} else {
			return "0";
		}
	}

}
