import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnector {
	
	private String localhost;
	private String username;
	private String password;
	
	public SQLConnector(String username, String password) {
		this.localhost = "jdbc:mysql://localhost:3006/fakeDatabase";
		this.username = username;
		this.password = password;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(localhost, username, password);
	}

}
