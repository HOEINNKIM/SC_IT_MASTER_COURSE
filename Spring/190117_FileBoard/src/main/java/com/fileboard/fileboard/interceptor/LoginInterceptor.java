package com.fileboard.fileboard.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {

	
	//true -> 통과 허용, false -> 잠깐 가지 마세요. -> response에 redirect를 설정
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		HttpSession session = request.getSession();
		String loginId = (String)session.getAttribute("loginId");
		
		
		//1.세션아이디의 널체크
		//2.컨텍스트 페스로 리다이렉트 앞에 프로젝트명을 적어두어야 한다.
		if(loginId==null) {
			response.sendRedirect(request.getContextPath() + "/login");
			return false;
		}
		
		
		return super.preHandle(request, response, handler);
	}
}