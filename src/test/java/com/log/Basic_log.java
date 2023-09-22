package com.log;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basic_log {
	static Logger log = Logger.getLogger(Basic_log.class); // factory design pattern without new and constructor for
															// logger

	public static void main(String[] args) {

		
		BasicConfigurator.configure();
		
		log.debug("debug");

		log.info("information");

		log.warn("warn");

		log.error("error");

		log.fatal("fatal");
	}

}
