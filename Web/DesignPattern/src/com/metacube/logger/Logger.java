package com.metacube.logger;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author Ravika
 * @since 10/21/2015
 * /
public class Logger {

	private static Logger logger = null;
	private static String logFile = null; 
	/**
	 * to make the private to constructor
	private Logger() {
	}
	
	/**
	 * to make logger class singleton
	 * 
	 * /
	public static Logger getLogger() {
		if(logger == null) {
			synchronized (Logger.class) {
				if(logger == null) {
					logger = new Logger();
				}
			}
		}
		return logger;
	}
	
	/**
	 * to get the file name in which the logs will be aadded
	 * @param cal : to get the time
	 * /
	private static String getFileName(Calendar cal) {
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd-MMM-yyyy");
		String dateString = dateFormat1.format(cal.getTime());
		logFile = "ExceptionLog-" + dateString + ".log";
		return logFile;
	}
	
	/**
	*to add log in the file
	* @param printStackTrace : to print the exception
	*/
	public void log(Object printStackTrace) {
		try {
			Calendar cal = Calendar.getInstance() ;
			String fileName = getFileName(cal);
			FileOutputStream fileOutputStreamObj = new FileOutputStream(fileName, true);
			PrintStream printStream = new PrintStream(fileOutputStreamObj);
			SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEE, MMM d, yyyy 'at' hh:mm:ss a");
			printStream.println("<"+dateFormat2.format(cal.getTime())+">\n["+printStackTrace+"]");
			printStream.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}		
	}

}
