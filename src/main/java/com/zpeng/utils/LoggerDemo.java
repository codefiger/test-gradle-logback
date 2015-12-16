package com.zpeng.utils;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zpeng.logback.LoggerBean;

public class LoggerDemo {
	public static final Logger logger = LoggerFactory.getLogger(LoggerDemo.class);
	
	public static void main(String[] args){
		logger.trace("trace log content");
		logger.debug("debug log content");
		logger.info("info log content");
		logger.warn("warn log content");
		logger.error("error log content");
		
		//LoggerBean loggerBean = new LoggerBean();
		Random random = new Random();
		int randomNum = random.nextInt();
		System.out.println(randomNum);
		System.out.println(String.format("%08x", randomNum));
	}
}
