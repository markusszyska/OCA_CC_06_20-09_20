package demoLogging;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class DemoLogProperties {

	public static Logger MYLOGGER;
	
	
	public static void main(String[] args) {
//		createLogProperties();
		readLoggingProperties();
	}
	
	
	private static void readLoggingProperties() {
		InputStream is = DemoLogProperties.class.getClassLoader().getResourceAsStream("logging.properties");
		
		try {
			LogManager.getLogManager().readConfiguration(is);
			MYLOGGER = Logger.getLogger("MeinLogger");			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Handler[] allHandler = MYLOGGER.getHandlers();
		for(Handler h : allHandler) {
			System.out.println("Class: " + h.getClass().getSimpleName());
		}		
		MYLOGGER.finest("finest");
		MYLOGGER.finer("finer");
		MYLOGGER.fine("fine");
		MYLOGGER.config("config");
		MYLOGGER.warning("warning");
		MYLOGGER.severe("severe");
		
	}


	public static void createLogProperties() {
		File file = new File("ressources/logging.properties");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}		
		try {
			PrintWriter pw = new PrintWriter(file);
			Properties prop = new Properties();
			prop.setProperty("java.util.logging.FileHandler.formatter", "java.util.logging.SimpleFormatter");
			prop.setProperty("java.util.logging.FileHandler.pattern", "Log2.log");
			prop.setProperty("java.util.logging.FileHandler.level", "ALL");
			prop.setProperty("java.util.logging.ConsoleHandler.formatter", "java.util.logging.SimpleFormatter");
			prop.setProperty("java.util.logging.ConsoleHandler.level", "FINEST");
			prop.setProperty(".level", "ALL");
			prop.setProperty("handlers", "java.util.logging.ConsoleHandler, java.util.logging.FileHandler");
			prop.setProperty("java.util.logging.FileHandler.append", "true");
			
			prop.setProperty("MeinLogger.level", "ALL");
			prop.setProperty("MeinLogger.handlers", "java.util.logging.ConsoleHandler, java.util.logging.FileHandler");
			prop.setProperty("MeinLogger.useParentHandlers", "false");
						
			/*
			 * Es gibt 7 Parameter(%0 bis %6) die genutzt werden können
			 * %0 und %1 beinhalten Datumswerte - Formate String s oder Time t
			 * %2 Klassenname und Methode von wo aus das Log erzeugt wurde - Format: String s
			 * %3 Der Loggername der die Log erzeugt hat -  Format: String s
			 * %4 Das Logging Level Format: String s
			 * %5 Die Nachricht des Logs Format String s
			 * %6 Ein evtl vorhandener Stacktrace Format String s
			 */
			prop.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-13s] [%5$-25s] %n");
			prop.store(pw, "Kommentar");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
