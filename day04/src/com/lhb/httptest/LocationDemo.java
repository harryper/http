package com.lhb.httptest;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * �ض������
 * @author harryper
 *
 */
public class LocationDemo extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//1,����״̬��Ϊ302֪ͨ�ͻ����ض���
		response.setStatus(302);
		//2,֪ͨ�ͻ����ض����Ŀ����Դ
		response.setHeader("location", "/day04/first.html");
	}
	

}
