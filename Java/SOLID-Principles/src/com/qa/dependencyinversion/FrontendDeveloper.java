package com.qa.dependencyinversion;

public class FrontendDeveloper implements Developer{
	private String coding = "JavaScript is used everywhere else";

	@Override
	public void develop() {
		System.out.println("Writing frontend...\n>> " + writeFE());
	}
	
	public String writeFE() {
		return coding;
	}
}