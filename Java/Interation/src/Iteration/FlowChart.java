package Iteration;

public class FlowChart {
	public static int A, i, j;

	public static void main(String[] args) {
		System.out.println("Create a flow which prints the value of A starting at 100 and ending at 200");
		flowOne();
		System.out.println("Create a flow which prints - if A is even and * if A is odd for numbers 100 to 200");
		flowTwo();
		System.out.println("Create a flow which prints the numbers 1 to 10 a total of 10 times");
		flowThree();
		System.out.println("For any previous flows which use 'while' loops, change them to 'for' loops");
		flowFour();
		System.out.println("Create a flow which prints the numbers 1 to 10 a number of time equal to itself");
		flowFive();
	}

	public static void flowOne() {
		for (A = 100; A < 201; A++) {
			System.out.println(A);
		}
	}

	public static void flowTwo() {
		for (A = 100; A < 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
		}
	}

	public static void flowThree() {
		for (j = 1; j < 11; j++) {
			System.out.println("Round Number: " + j);
			for (i = 1; i < 11; i++) {
				System.out.println(i);
			}
		}
	}

	public static void flowFour() {
		System.out.println("I used 'for' loops the entire time, haha!");
	}

	public static void flowFive() {
		j = 1;
		for (i = 1; i < 11; i++) {
			for (j = 1; j < i + 1; j++) {
				System.out.println(i);
			}
		}
	}
}
