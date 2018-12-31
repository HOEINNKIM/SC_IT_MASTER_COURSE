package com.mycom.test2;

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
	
	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String calculate() {
		return "result";
	}
}
