package com.zpeng.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerDemo {
	public static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
	
	public static void main(String[] args){
		logger.trace("trace log content");
		logger.debug("debug log content");
		logger.info("info log content");
		logger.warn("warn log content");
		logger.error("error log content");
	}
}
