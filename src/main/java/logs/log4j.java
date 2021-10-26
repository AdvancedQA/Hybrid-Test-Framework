package logs;

import org.apache.logging.log4j.LogManager;

public class log4j {
	
	private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(log4j.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Hello! \n");
		
		logger.debug("This is a debug message");
		logger.info("This is an information message");
		logger.error("This is an error message");
		logger.warn("This is a warning message");
		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");

	}

}
