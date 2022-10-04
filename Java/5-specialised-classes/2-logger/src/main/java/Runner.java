import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Runner {

	public static void main(String[] args) {
		LoggingDemo LOGGER = new LoggingDemo();
		SQLConnector badConnection = new SQLConnector("root","Apple.Bob1");
		
		try (Connection con = badConnection.getConnection();
				Statement state = con.createStatement();) {
			state.executeUpdate("CREATE TABLE IF NOT EXISTS TurnTable");
		} catch (SQLException e) {
			LOGGER.loggerFunctions();
		}
	}

}
