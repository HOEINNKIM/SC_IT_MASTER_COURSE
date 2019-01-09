package com.myApp.calcTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculateController {

	@RequestMapping(value = "/plus", method = RequestMethod.GET)
	public String plus(int numOne, int numTwo, Model model) {
		model.addAttribute("result", numOne + numTwo);
		return "result";
	}

	@RequestMapping(value = "/times", method = RequestMethod.GET)
	public String times(int numOne, int numTwo, Model model) {
		model.addAttribute("result", numOne * numTwo);
		return "result";
	}

	@RequestMapping(value = "/minus", method = RequestMethod.GET)
	public String minus(int numOne, int numTwo, Model model) {
		model.addAttribute("result", numOne - numTwo);
		return "result";
	}

	@RequestMapping(value = "/divide", method = RequestMethod.GET)
	public String divide(int numOne, int numTwo, Model model) {
		model.addAttribute("result", numOne / numTwo);
		return "result";
	}
	
	@RequestMapping(value = "/calculateNum", method = RequestMethod.GET)
	public String calculateNum(int numOne, int numTwo, String logic, Model model) {
		int result=0;
		if(logic.equals("plus")) {
			result=numOne+numTwo;
		}else if(logic.equals("minus")) {
			result=numOne-numTwo;
		}else if(logic.equals("times")) {
			result=numOne*numTwo;
		}else if(logic.equals("divide")) {
		
			try {
				result=numOne/numTwo;				
			} catch(Exception e) {
				model.addAttribute("warning", "0으로 나눌 수 없습니다.");
				return "calculate";
			}
			
		}
		
		model.addAttribute("result", result);
		return "calculate";
		
	}
	
	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String calculate() {
		return "calculate";
	}
}
