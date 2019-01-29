package com.fileboard.fileboard.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	
	//true -> ��� ���, false -> ��� ���� ������. -> response�� redirect�� ����
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		String loginId = (String)session.getAttribute("loginId");
		
		
		//1.���Ǿ��̵��� ��üũ
		//2.���ؽ�Ʈ �佺�� �����̷�Ʈ �տ� ������Ʈ���� ����ξ�� �Ѵ�.
		if(loginId==null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}
		
		
		return super.preHandle(request, response, handler);
	}
}