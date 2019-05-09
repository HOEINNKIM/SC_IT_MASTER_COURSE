package com.practice.ajax;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {

		
		return "home";
	}

	@RequestMapping(value = "/ajaxTest", method = RequestMethod.GET)
	public @ResponseBody HashMap<String, String> ajaxTest(String userId) {

		HashMap<String, String> aa = new HashMap<String, String>();
		aa.put("a", "1");
		aa.put("b", "2");
		aa.put("c", "3");
		
		
		return aa;
		
	}

}
