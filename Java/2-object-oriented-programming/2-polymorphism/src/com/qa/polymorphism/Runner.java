package com.qa.polymorphism;

public class Runner {

	public static void main(String[] args) {
		System.out.println("======== PENNE FACTS ========");
		Penne penne = new Penne();
		penne.description();
		penne.cooking();
		System.out.println(" ");
		System.out.println("======== PASTA FACTS ========");
		Pasta pasta = new Penne();
		((Penne) pasta).description();
		pasta.cooking();
	}

}
