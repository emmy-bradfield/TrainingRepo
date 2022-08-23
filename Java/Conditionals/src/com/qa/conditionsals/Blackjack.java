package com.qa.conditionsals;

public class Blackjack {

	public static void main(String[] args) {
		blackjack(24,25);
	}
	
	public static void blackjack(int x, int y) {
		if (x > 0 && x > y && x < 22) {
			System.out.println(x);
		} else if (y > 0 && y > x && y < 22) {
			System.out.println(y);
		} else if (x > y && y > 0 && y < 22) {
			System.out.println(y);
		} else if (y > x && x > 0 && x < 22) {
			System.out.println(x);
		} else System.out.println("0");
	}

}
