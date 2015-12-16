package com.zpeng.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoggerBean {
	public static final Logger logger = LoggerFactory.getLogger(LoggerBean.class);
	
	public LoggerBean(){
		logger.trace("trace log content   ---");
		logger.debug("debug log content   ---");
		logger.info("info log content   ---");
		logger.warn("warn log content   ---");
		logger.error("error log content   ---");
	}
	
}
