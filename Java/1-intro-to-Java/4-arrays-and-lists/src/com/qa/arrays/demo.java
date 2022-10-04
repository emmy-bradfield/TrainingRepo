package com.qa.arrays;

public class demo {

	public static int num[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

	public static String names[] = { "Alex", "Bobbie", "Carmen", "Dannie" };
	
	public static int[][] nums = { {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};

	public static void main(String[] args) {
		for (int i : num) {
			System.out.println("Number: " + i);
		}
		for (int j = 0; j < names.length; j++) {
			System.out.println("Name: " + names[j]);
		}
		for (int k = 0; k < nums.length; k++) {
			for (int l = 0; l < nums[k].length; l++) {
				System.out.println("Numbers: " + nums[k][l]);
			}
		}

	}
}
