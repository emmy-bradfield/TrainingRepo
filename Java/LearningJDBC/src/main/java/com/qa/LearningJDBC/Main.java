package com.qa.LearningJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// state.executeUpdate(String);
// state.executeQuery(String);

public class Main {

	public static void main(String[] args) {
		DatabaseConnecter test = new DatabaseConnecter("root", "Apple.Bob1");
		try (Connection con = test.getConnection(); 
				Statement state = con.createStatement();) {
			state.executeUpdate("INSERT INTO Customers VALUES (1, 'Emily Bradfield', 'emily-bradfield@outlook.com')");
			state.executeUpdate("INSERT INTO Customers VALUES (2, 'Bianca Botea', 'bbotea@gmail.com')");
			state.executeUpdate("INSERT INTO Products VALUES (1, 'Condoms(used)', 0.50)");
			state.executeUpdate("INSERT INTO Products VALUES (2, 'Bounty Chocolate Bar', 1.20)");
			state.executeUpdate("INSERT INTO Orders VALUES (1, 2, '2022-07-15', 2, 1)");
			state.executeUpdate("INSERT INTO Orders VALUES (2, 12, '2022-07-15', 1, 2)");
		} catch (SQLException e) {
			// TODO
			e.printStackTrace();
		}
		
		try (Connection con = test.getConnection();
				Statement state = con.createStatement();) {
			ResultSet rs = state.executeQuery("SELECT * FROM Customers");
			while(rs.next()) {
				int ID = rs.getInt("customerID");
				String name = rs.getString("customerName");
				String email = rs.getString("customerEmail");
				Customer record = new Customer(ID, name, email);
				record.customerOut();
			}
			ResultSet rs2 = state.executeQuery("SELECT * FROM Products");
			while(rs2.next()) {
				int ID = rs2.getInt("productID");
				String title = rs2.getString("productName");
				Double cost = rs2.getDouble("productCost");
				Product stock = new Product(ID, title, cost);
				stock.productOut();
			}
			ResultSet rs3 = state.executeQuery("SELECT * FROM Orders");
			while(rs3.next()) {
				int ID = rs3.getInt("orderID");
				Double total = rs3.getDouble("orderAmount");
				Date date = rs3.getDate("orderDate");
				int item = rs3.getInt("fk_productID");
				int customer = rs3.getInt("fk_customerID");
				Order order = new Order(ID, total, date, item, customer);
				order.orderOut();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
