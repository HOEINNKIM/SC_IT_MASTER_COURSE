package com.spring.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import VO.VO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	//스프링의 장점 1.
	// "/" 액션은 곧 /index.jsp 를 액션으로 호출하는 것이다. method는 get와 post를 처리하는 것이다.
	// return에 적힌 "home"이라는 이름을 갖는 jsp 파일을 view에서 찾아 리턴한다. 이러한 방식은 무조건 포워드 방식이다.
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		
	
		return "home";
	}

	//스프링의 장점 2.
	//form 안의 input의 name 값과 같은 String을 파라미터로 건네주면 알아서 인식
	//여러 값을 받을 때는 vo로 받을 수 있다. 단 vo안에 선언된 객체의 이름과 jsp안의 name 값이 일치해야 한다.
	
	//스프링의 장점3.
	//값을 클라이언트에 전달해줄 때  Model 객체에 넣어서 전달한다.
	//객체를 전달했을 때, jsp안에서 vo.필드명을 사용하면 바로 값을 사용가능하다.
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(VO vo, Model model) {
		//System.out.println("!!" + message);
		System.out.println("!!" + vo.getMessage());
		
		model.addAttribute("vo", vo);
		return "result";
	}
	
	@RequestMapping(value = "/task", method = RequestMethod.GET)
	public String task(VO vo, Model model) {
		System.out.println("task 메서드에 들어오다" + vo);
		model.addAttribute("vo", vo);
		return "task";
	}
	
	
	
	
	
}
