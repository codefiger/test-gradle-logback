package com.zpeng.thrift;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

/**
 * Service handler 类必须实现 AdditionService.Iface接口。
 * 
 * @author peng.zhang
 */
public class AdditionServiceHandler implements AdditionService.Iface {
	private static final Logger logger = LoggerFactory.getLogger(AdditionServiceHandler.class);

	@Override
	public int add(int n1, int n2) throws TException {
		MDC.put("rpid", String.format("[rpid=%08x]", n1));
		logger.info("invoke thrift handler!");
		return n1 + n2;
	}

}