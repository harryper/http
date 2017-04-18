package com.lhb.httptest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadDemo extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//通知客户端以下载的方式打开图片
		response.setHeader("content-disposition", "attachment; filename=giveyou.jpg");
		
		InputStream is = new FileInputStream(new File("D:\\WinWallpaper\\MorganSessions.jpg"));
		
		OutputStream os = response.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = is.read(buf)) != -1) {
			os.write(buf, 0, len);
		}
		is.close();
		os.close();
	}

}
