package demoLogging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SimpleLog {

	/*
	 * A Logger object is used to log messages for a specific system or application
	 * component. Loggers are normally named,using a hierarchical dot-separated
	 * namespace. Logger name scan be arbitrary strings, but they should normally be
	 * based onthe package name or class name of the logged component, suchas
	 * java.net or javax.swing. In addition it is possible to create"anonymous"
	 * Loggers that are not stored in the Logger namespace.
	 */
	public static final Logger MYLOGGER = Logger.getLogger("Unser Logger");
	private final static String format = "[%1$tF %1$tT] %n[%4$-13s] %n[%5$-25s] %n---%n";
	private final static String key = "java.util.logging.SimpleFormatter.format";
	
	public static void main(String[] args) {
		System.setProperty(key, format);
		
		MYLOGGER.setLevel(Level.ALL);
		MYLOGGER.setUseParentHandlers(false);
		ConsoleHandler myConsoleHandler = new ConsoleHandler();
		myConsoleHandler.setLevel(Level.FINE);
		
		MYLOGGER.addHandler(myConsoleHandler);
		
		//Level.ALL - Integer.MIN_VALUE
		MYLOGGER.finest("finest"); 	//300
		MYLOGGER.finer("finer");	//400
		MYLOGGER.fine("fine");		//500
		MYLOGGER.config("config");	//700
		MYLOGGER.info("Info");		//800
		MYLOGGER.warning("Warning");//900
		MYLOGGER.severe("severe");	//1000
		//Lelvel.OFF - Integer.MAX_VALUE
	}
	
}
