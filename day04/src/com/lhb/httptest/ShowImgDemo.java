package com.lhb.httptest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowImgDemo extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//打开文件的类型
//		response.setHeader("content-type", "image/jpeg");
		response.setHeader("content-type", "video/mp4sss");
		//读取文件
//		InputStream is = new FileInputStream(new File("D:\\WinWallpaper\\MorganSessions.jpg"));
		InputStream is = new FileInputStream(new File("D:\\360CloudEnterprise\\Cache\\never.mp4"));
		
		OutputStream os = response.getOutputStream();
		int len = 0;
		byte[] buf = new byte[1024];
		while((len = is.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		
		is.close();
		os.close();
	}

}
