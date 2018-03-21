package com.woman.tool;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class IsLoginFilter implements Filter{
	
	public void destroy() {
		
	}
	
	public void init(FilterConfig arg0) throws ServletException {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req =(HttpServletRequest) request;
		HttpServletResponse resp =(HttpServletResponse) response;
		
		String uri = req.getRequestURI();
			System.out.println(">>>>>>>>"+uri);
		if(uri.endsWith("Maven_Project/") || uri.endsWith("Maven_Project/Login/login.htmls") || uri.indexOf("index") >= 0  || uri.indexOf("css") >= 0  || uri.indexOf("js") >= 0  || uri.indexOf("images") >= 0 ){
			System.out.println(111);
			chain.doFilter(request, response);
		}else{
			Object user_name = req.getSession().getAttribute("user_name");
			System.out.println(222);
			System.out.println("----"+user_name+"----");
			if(user_name != null){
				System.out.println(333);
				chain.doFilter(request, response);
			}else{
				System.out.println(444);
				resp.sendRedirect("./index.jsp");
			}
		}
	}
}