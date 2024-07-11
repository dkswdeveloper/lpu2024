package main;

import org.apache.log4j.Logger;

public class MainLogs {
		
	private static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
//		fun(4);
		logger.trace("the value of list items is this");		
		logger.debug("the method was called with the following arguments");
		logger.info("the library was installed or message from the server was not received");
		logger.warn("the library to convert xml was not found using default lib");
		//normally in catch block
		logger.error("the exception with values occured");
		logger.fatal("Sorry please restart the software/system");
	}
	public static void fun(int x)
	{
		logger.debug("Fun method with args "  + x);
		if(x <10) 
		{
			logger.warn("library could not be loaded");
		}
		for(int i = 1; i<= 4; i++)
		{
			try {
			logger.trace("value of i = " + i);
			int s = i*3/ (i+i);
			}
			catch(Exception e)
			{
				logger.error(e);
			}
		}
		logger.info("Calcuations completed");
	}
}
