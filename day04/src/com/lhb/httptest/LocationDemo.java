package com.lhb.httptest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 重定向测试
 * @author harryper
 *
 */
public class LocationDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1,设置状态码为302通知客户端重定向
		response.setStatus(302);
		//2,通知客户端重定向的目标资源
		response.setHeader("location", "/day04/first.html");
	}
	

}
