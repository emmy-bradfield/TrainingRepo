package com.qa.arrays;

public class ArraysTask {
	
	public static int arrayOne[] = new int[10];
	
	public static int arrayTwo[] = new int[5];
	
	public static void taskOne() {
		System.out.println("Task One:");
		System.out.println("Creating array...");
		System.out.println(("arrayOne created, length: " + arrayOne.length));
		System.out.println("Populating array...");
		arrayOne[0] = 0;
		arrayOne[1] = 1;
		arrayOne[2] = 2;
		arrayOne[3] = 3;
		arrayOne[4] = 4;
		arrayOne[5] = 5;
		arrayOne[6] = 6;
		arrayOne[7] = 7;
		arrayOne[8] = 8;
		arrayOne[9] = 9;
		System.out.print(("arrayOne populated, values: "));
		for (int i : arrayOne) {
			System.out.print(arrayOne[i] + ", ");
		}
		System.out.println("");
		System.out.println("Confirming location of all elements");
		for (int i : arrayOne) {
			System.out.println(("Position " + i + ": " + arrayOne[i]));
		}
	}
	
	public static void taskTwo() {
		System.out.println("Task Two:");
		System.out.println("Creating array...");
		System.out.println(("arrayTwo created, length: " + arrayTwo.length));
		System.out.println("Populating array with for loop...");
		for (int i = 0; i < arrayTwo.length; i ++) {
			arrayTwo[i] = i;
			System.out.println("Position " + i + " populated, element: " + i);
		}
		System.out.print("Population complete, values: ");
		for (int i = 0; i < arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + ", ");
		}
		System.out.println("");
		System.out.println("Amending array with for loop...");
		for (int i = 0; i < arrayTwo.length; i ++) {
			int j = 5*i;
			arrayTwo[i] = j;
			System.out.println("Position " + i + " populated, element: " + j);
		}
		System.out.print("Amending complete, values: ");
		for (int k = 0; k < arrayTwo.length; k++) {
			System.out.print(arrayTwo[k] + ", ");
		}
	}

	public static void main(String[] args) {
		taskOne();
		System.out.println("");
		taskTwo();

	}

}
