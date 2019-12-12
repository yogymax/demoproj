package com.scp.java;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class LoggingDemo {
	
	public static Logger log = Logger.getLogger(LoggingDemo.class);
	int var=12;
	int num = (byte)10.0;
	
	//OFE WI DTA
	public static void main(String[] args) throws InterruptedException {
		
		log.setLevel(Level.ERROR);//will override to default property
		
		for(int i=0;i<1000;i++) {
		log.info("this is information message");
		log.debug("This is debug Message");
		log.error("This is error Message");
		log.trace("This is trace message");
		log.fatal("This is fatal message");
		log.warn("This is warn Message");
			TimeUnit.SECONDS.sleep(5);
		}
	}
	
	

}
