package com.ForChi.ForChi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoController {

	@RequestMapping(value = "/go", method = RequestMethod.GET)
	public String go(String first, String second, Model model, String clicked) {

		int first1 = Integer.valueOf(first);
		int second1 = Integer.valueOf(second);
		if(clicked.equals("+")) {
			int result = first1 + second1;
			model.addAttribute("result", result);
			return "home";
			
		} else if(clicked.equals("-")) {
			int result = first1 - second1;
			model.addAttribute("result", result);
			return "home";
			
		} else if(clicked.equals("*")) {
			int result = first1 * second1;
			model.addAttribute("result", result);
			return "home";
		
		} else if(clicked.equals("/")) {
			int result = first1 / second1;
			model.addAttribute("result", result);
			return "home";
			
		}
		
		String result = "값이 없음";
		model.addAttribute("result", result);
		return "home";
	}
	
}
