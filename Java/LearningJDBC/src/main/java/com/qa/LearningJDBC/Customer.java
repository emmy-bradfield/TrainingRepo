package com.qa.LearningJDBC;
import java.util.ArrayList;
import java.util.List;

public class Customer {
	Integer customerID;
	String customerName;
	String customerEmail;
	
	List<Customer> customers = new ArrayList<>();
	
	public Customer(int customerID, String customerName, String customerEmail) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		customers.add(this);
	}
	
	public void customerOut() {
		System.out.println("Customer ID #150722-" + customerID + " belongs to " + customerName + " who can be contacted on " + customerEmail);
	}

}
