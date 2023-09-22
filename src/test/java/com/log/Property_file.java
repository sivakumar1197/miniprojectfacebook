package com.log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_file {

	static Logger log = Logger.getLogger(Property_file.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		log.debug("debug");

		log.info("information");

		log.warn("warn");

		log.error("error");

		log.fatal("fatal");
	}

}
