package demoLogging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogMain {
	private MyLogger myLogger;

	public MyLogger getMyLogger() {
		return myLogger;
	}

	public void setMyLogger(MyLogger myLogger) {
		this.myLogger = myLogger;
	}
	public LogMain() {
		this.setMyLogger(new MyLogger());
	}
	
	public static void main(String[] args) {
		LogMain lm = new LogMain();
		lm.doStuff();
	}
	
	public void doStuff() {
		Logger l = this.getMyLogger().getLog();
		l.setLevel(Level.ALL);
		l.entering(this.getClass().getSimpleName(), "doStuff()");
		l.fine("fine");
		l.finer("finer");
		l.finest("finest");
		l.info("info");
		l.severe("severe");
		l.warning("warning");
		l.log(Level.SEVERE, "Exception geworfen", new Exception("Ausnahme"));
	
		l.exiting(this.getClass().getSimpleName(), "doStuff()");
	}
	
	
	
	
}
