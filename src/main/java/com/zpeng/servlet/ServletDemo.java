package com.zpeng.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 好久没写过servelt,jsp，重温下
 * mapping url : testServelt
 * @author peng.zhang
 *
 */
public class ServletDemo extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(ServletDemo.class);

	private static final long serialVersionUID = 8637112013021873834L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("testServlet service.");
		request.setAttribute("name", "figer");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

	@Override
	public void destroy() {
		logger.debug("testServlet destroy.");
	}

	@Override
	public void init() throws ServletException {
		logger.debug("testServlet init.");
	}

}
