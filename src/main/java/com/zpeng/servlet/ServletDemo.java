package com.zpeng.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zpeng.common.Constants;

/**
 * 好久没写过servelt,jsp，重温下
 * mapping url : testServelt
 * @author peng.zhang
 *
 */
public class ServletDemo extends HttpServlet{
	
	private static final Logger logger = LoggerFactory.getLogger(ServletDemo.class);
	private static final Logger performance_logger = LoggerFactory.getLogger(Constants.PERFORMANCE_LOGGER_NAME);

	private static final long serialVersionUID = 8637112013021873834L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		logger.debug("testServlet service.");
		performance_logger.info("开始：{}", new Date());
		long startTimesatmp = System.currentTimeMillis();
		request.setAttribute("name", "figer");
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		performance_logger.info("结束：{}ms", System.currentTimeMillis() - startTimesatmp);
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
