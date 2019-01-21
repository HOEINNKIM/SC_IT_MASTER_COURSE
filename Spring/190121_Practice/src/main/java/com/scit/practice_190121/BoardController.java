package com.scit.practice_190121;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.practice_190121.DAO.BoardDAO;

@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value = "/Board", method = RequestMethod.GET)
	public String Board() {

		return "Board";
	}
	
	@RequestMapping(value = "/selectBoard", method = RequestMethod.GET)
	public String selectBoard() {

		
		return "redirect:/Board";
	}

	
}
