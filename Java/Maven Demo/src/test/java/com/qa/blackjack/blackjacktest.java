package com.qa.blackjack;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class blackjacktest {
	
	blackjack tryMe = new blackjack();
	
	// Test One: if both hands are equal, 0 is returned
	@Test
	public void handOneHandTwoEqual() {
		int a = 15;
		int b = 15;
		
		assertEquals(0, blackjack.play(a,b));
	}
	// Test One Passed
	
	// Test Two: if either hand is less than 0, return zero
	@Test
	public void handOneHandTwoZero() {
		int a = -1;
		int b = 10;
		
		assertEquals(0, blackjack.play(a, b));
		assertEquals(0, blackjack.play(b, a));
		
		int c = -2;
		
		assertEquals(0, blackjack.play(a, c));
	}
	// Test Two Passed
	
	// Test Three: if both hands are over 21, return 0
	@Test
	public void handOneHandTwoTwentyOne() {
		int a = 22;
		int b = 30;
		
		assertEquals(0, blackjack.play(a, b));
	}
	// Test Three Passed
	
	// Test Four: if hand one is over 21, return hand two
	@Test
	public void handOneTwentyOne() {
		int a = 27;
		int b = 10;
		
		assertEquals(b, blackjack.play(a, b));
	}
	// Test Four Passed
	
	// Test Five: if hand two is over 21, return hand one
	@Test
	public void handTwoTwentyOne() {
		int a = 27;
		int b = 10;
		
		assertEquals(b, blackjack.play(b, a));
	}
	// Test Five Passed
	
	// Test Six: if no other conditions are met and hand one is the larger, return hand one
	@Test
	public void handOneWin() {
		int a = 18;
		int b = 16;
		
		assertEquals(a, blackjack.play(a, b));
	}
	// Test Six Passed
	
	// Test Seven: if no other conditions are met and hand two is the larger, return hand two
	@Test
	public void handTwoWin() {
		int a = 12;
		int b = 19;
		
		assertEquals(b, blackjack.play(a, b));
	}
	// Test Seven Passed
}
