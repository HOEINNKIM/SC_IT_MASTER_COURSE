package com.ForChi.ForChi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Go2Controller {

	@RequestMapping(value = "/go2", method = RequestMethod.GET)
	public String go2(int first, int second, String hidden, Model model) {

		System.out.println(hidden);
		int result = 0;
		
		if(hidden.equals("+")) {
			result = first + second;
			model.addAttribute("result", result);
			return "go2";	

		} else if(hidden.equals("-")) {
			result = first - second;
			model.addAttribute("result", result);
			return "go2";	
			
		} else if(hidden.equals("*")) {
			result = first * second;
			model.addAttribute("result", result);
			return "go2";	
			
		} else if(hidden.equals("/")) {
			result = first / second;
			model.addAttribute("result", result);
			return "go2";	
			
		} 

		model.addAttribute("result", result);
		return "go2";	
	}
}
