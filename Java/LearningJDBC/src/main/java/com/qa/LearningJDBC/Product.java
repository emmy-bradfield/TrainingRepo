package com.qa.LearningJDBC;
import java.util.ArrayList;
import java.util.List;

public class Product {
	Integer productID;
	String productName;
	Double productCost;
	
	List<Product> products = new ArrayList<>();
	
	public Product(int productID, String productName, Double productCost) {
		this.productID = productID;
		this.productName = productName;
		this.productCost = productCost;
		products.add(this);
	}
	
	public void productOut() {
		System.out.println("Product ID #150722-" + productID + " references " + productName + " (£" + productCost + ")");
	}

}
