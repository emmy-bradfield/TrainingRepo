package com.qa.blackjack;

import java.util.Scanner;

import com.qa.blackjack.blackjack;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.nextLine();
		int b = scan.nextInt();
		scan.nextLine();
		scan.close();
		
		blackjack.play(a, b);

	}

}