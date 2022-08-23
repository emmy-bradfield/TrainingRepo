package com.qa.LearningJDBC;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Order {
	Integer orderID;
	Double orderAmount;
	Date orderDate;
	Integer fk_productID;
	Integer fk_customerID;
	
	List<Order> orders = new ArrayList<>();
	
	public Order(int orderID, double orderAmount, Date orderDate, int fk_productID, int fk_customerID) {
		this.orderID = orderID;
		this.orderAmount = orderAmount;
		this.orderDate = orderDate;
		this.fk_productID = fk_productID;
		this.fk_customerID = fk_customerID;
		orders.add(this);
	}
	
	public void orderOut() {
		System.out.println("Order ID #150722-" + orderID + " references and order placed on " + orderDate + " totalling £" + orderAmount + " | Ordered by C#150722-" + fk_customerID + " containing P#150722-" + fk_productID);
	}
	

}
