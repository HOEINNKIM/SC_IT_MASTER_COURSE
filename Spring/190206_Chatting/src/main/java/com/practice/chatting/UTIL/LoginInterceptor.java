package com.practice.chatting.UTIL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		
		String loginId = (String)session.getAttribute("loginId");
		System.out.println("인터셉터 시작");
		if(loginId==null) {
			System.out.println("로그인 안된 것 확인!");
			response.sendRedirect(request.getContextPath() + "/");
			return false;
		}
		
		return super.preHandle(request, response, handler);
	}
	
	
}
