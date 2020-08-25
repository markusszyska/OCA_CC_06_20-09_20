package demoLogging;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class MyLogger {

	private Logger log;

	public Logger getLog() {
		return log;
	}

	public void setLog(Logger log) {
		this.log = log;
	}
	
	public MyLogger() {
		this.setLog(Logger.getLogger(Logger.GLOBAL_LOGGER_NAME));
		this.getLog().setUseParentHandlers(false);
		
		try {
			FileHandler fh = new FileHandler("Log.log");
			fh.setLevel(Level.FINE);
			fh.setFormatter(new Formatter() {				
				@Override
				public String format(LogRecord record) {
					String ret = "";
					if(record.getLevel().intValue() >= Level.WARNING.intValue()) {
						ret += "ATTENTION";
					}
					ret += record.getLevel();
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm");
					Date d = new Date(record.getMillis());
					ret += " " + dateFormat.format(d);
					ret += this.formatMessage(record);
					ret += "\r\n";
					return ret;
				}
			});
			this.getLog().addHandler(fh);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
	}
	
	
}
