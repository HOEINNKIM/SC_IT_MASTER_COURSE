package com.supermarket.supermarket.UTIL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		HttpSession session = request.getSession();
		
		System.out.println(1);
		if(session.getAttribute("adminId")==null) {
			System.out.println(2);
			response.sendRedirect(request.getContextPath() + "/admin/adminHome");
			return false;			
		}
		System.out.println(3);		
		return super.preHandle(request, response, handler);
	}
	
	
}
