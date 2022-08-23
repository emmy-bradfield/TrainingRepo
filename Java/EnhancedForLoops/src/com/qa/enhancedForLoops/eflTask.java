package com.qa.enhancedForLoops;

import java.util.ArrayList;
import java.util.List;

public class eflTask {

	public static void taskOne() {
		System.out.println(
				"1) Create an array of strings and iterate through it, printing each value to console, using an enhanced for loop.");
		List<String> makeup = new ArrayList<>();
		makeup.add("Eyeliner");
		makeup.add("Eyeshadow");
		makeup.add("Foundation");
		makeup.add("Lipstick");
		makeup.add("Contour");
		makeup.add("Concealer");
		makeup.add("Mascara");
		makeup.add("Brow Pomade");
		System.out.println("\n ...new array created: makeup...\n ...printing contents...\n");
		for (String s : makeup) {
			System.out.println("- " + s);
		}
	}

	public static void taskTwo() {
		System.out.println(
				"2) Create an array of integers 1-20 and iterate through it, using an enhanced for loop, square, and then print each value.");
		List<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			numbers.add(i + 1);
		}
		System.out.println("\n ...new array created: numbers...\n ...printing contents...\n");
		for (int n : numbers) {
			System.out.print(n + " ");
		}
		System.out.println("");
		System.out.println("\n ...amending values to square of self...\n ...printing contents...\n");
		for (int j = 0; j < numbers.size(); j++) {
			int k = (numbers.get(j) * numbers.get(j));
			numbers.set(j, k);
			System.out.print(numbers.get(j) + " ");
		}
	}

	public static void taskThree(int n) {
		System.out.println("3) Create a method that returns a boolean and accepts an integer as a parameter, if the integer is even, return true, if not then return false.");
		System.out.println("");
		boolean output;
		if (n % 2 == 0) {
			output = true;
		} else {
			output = false;
		}
		System.out.println("The number " + n + " is even:\n" + output);
		}
	
	public static void taskFour() {
		System.out.println("Using the array of integers from exercise 2 and the method created in exercise 3; iterate through the array using an enhanced for loop, calling the method from exercise 3 in the body.\n"
				+ "If the value is even, cube it, then print it to console\n"
				+ "If the value is odd, square it, then print it to console.\n");
		System.out.println("...loading integers from previous methods...\n...loading complete\n...establising if even...\n...applying method...\n...amend complete, printing contents...\n");
		List<Integer> boolNumbers = new ArrayList<>();
		boolean isEven;
		for (int i = 0; i < 20; i++) {
			boolNumbers.add(i + 1);
		}
		for (int x : boolNumbers) {
			int sq = (x*x);
			int cu = (x*x*x);
			if (x % 2 == 0) {
				System.out.println(x + " is even, so we square it to get " + sq);
			} else {
				System.out.println(x + " is odd, so we cube it to get " + cu);
			}
		}
		
	}

	public static void main(String[] args) {
		taskOne();
		System.out.println("");
		System.out.println("");
		taskTwo();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		taskThree(10);
		System.out.println("");
		System.out.println("");
		taskFour();

	}

}
