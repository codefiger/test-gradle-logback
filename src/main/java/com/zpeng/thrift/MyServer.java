package com.zpeng.thrift;

import org.apache.thrift.transport.TServerSocket; 
import org.apache.thrift.transport.TServerTransport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.thrift.server.TServer; 
import org.apache.thrift.server.TServer.Args; 
import org.apache.thrift.server.TSimpleServer; 
   
/**
 * a simple server,start first
 * @author peng.zhang
 *
 */
public class MyServer { 
	private static final Logger logger = LoggerFactory.getLogger(MyServer.class);
	public static final int PORT = 9010;
	
	public static void StartsimpleServer(AdditionService.Processor<AdditionServiceHandler> processor) { 
		try { 
			TServerTransport serverTransport = new TServerSocket(PORT); 
		    TServer server = new TSimpleServer(new Args(serverTransport).processor(processor)); 
		   
		    // Use this for a multithreaded server 
		    // TServer server = new TThreadPoolServer(new 
		    // TThreadPoolServer.Args(serverTransport).processor(processor)); 
		   
		    logger.info("Starting the simple server..."); 
		    server.serve();
		    logger.info("Start successful!"); 
	    } catch (Exception e) { 
		    e.printStackTrace(); 
	    } 
	 } 
    
	 public static void main(String[] args) { 
		 StartsimpleServer(new AdditionService.Processor<AdditionServiceHandler>(new AdditionServiceHandler())); 
	 } 
   
}