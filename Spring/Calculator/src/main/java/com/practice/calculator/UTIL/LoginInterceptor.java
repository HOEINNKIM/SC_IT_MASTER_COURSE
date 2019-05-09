package com.practice.calculator.UTIL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		
		String id = (String)session.getAttribute("loginId");
		
		if(id==null || id=="") {
			
			
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}
		
		
		return super.preHandle(request, response, handler);
	}
	
	
}