import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo {
	
	private final Logger LOGGER = LogManager.getLogger(); 
	
	public void loggerFunctions() {
		LOGGER.info("The URL you have provided for the localhost is not recognised.\\n'jdbc:mysql://localhost:3306/' followed by your database names is usually best.\\nIf this is still not working, check the SQL connector is in\\nthis project's build path");
		LOGGER.warn("Warning: the SQL localhost is not recognised; unable to proceed");
//		LOGGER.error("Hello no stop that, big bad, no no no - stOP!");
//		LOGGER.fatal("Damn you messed up so bad I don't even know what to tell you");
	}
}
