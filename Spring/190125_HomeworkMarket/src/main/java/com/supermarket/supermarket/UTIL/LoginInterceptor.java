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
		
		if(session.getAttribute("adminId")==null) {
			response.sendRedirect(request.getContextPath() + "/admin/adminHome");
			return false;			
		}
		return super.preHandle(request, response, handler);
	}
	
	
}
