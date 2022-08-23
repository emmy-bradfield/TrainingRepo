// NOTE TO SELF: ENSURE THE SQL CONNECTOR IS ADDED TO THE BUILD PATH FOR EVERY PROJECT
package com.qa.LearningJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class DatabaseConnecter {
	
	// Attributes
	public static final Logger LOGGER = LogManager.getLogger(DatabaseConnecter.class);

	private String jdbcConnectionURL;
	private String username;
	private String password;

	// Constructors - one with default URL and one with option to set URL
		// The '/test_jdbc' is the specific database in SQL
	public DatabaseConnecter(String username, String password) {
		jdbcConnectionURL = "jdbc:mysql://localhost:3306/test_jdbc"; 
		this.username = username;
		this.password = password;
	}

	public DatabaseConnecter(String jdbcConnectionURL, String username, String password) {
		this.jdbcConnectionURL = jdbcConnectionURL;
		this.username = username;
		this.password = password;
	}
	
	// The connector which may throw an exception - it will be wrapped in a try-catch when executed in main
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(jdbcConnectionURL, username, password);
	}

}