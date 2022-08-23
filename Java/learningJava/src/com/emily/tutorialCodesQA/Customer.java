package com.emily.tutorialCodesQA;

public class Customer {

	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String street;
	private String postcode;
	
	public Customer() { }
	
	public Customer(String email, String password, String firstName, String lastName, String street, String postcode) {
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.setLastName(lastName);
		this.street = street;
		this.postcode = postcode;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getEmail() {
		return email;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
