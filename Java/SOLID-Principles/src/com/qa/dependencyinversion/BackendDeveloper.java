package com.qa.dependencyinversion;

public class BackendDeveloper implements Developer {
	private String coding = "C# is just Microsoft Java anyway";

	@Override
	public void develop() {
		System.out.println("Writing backend...\n>> " + writeBE());
	}
	
	public String writeBE() {
		return coding;
	}

}
