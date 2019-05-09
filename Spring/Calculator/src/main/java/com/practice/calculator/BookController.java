package com.practice.calculator;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.practice.calculator.DAO.BookDAO;
import com.practice.calculator.VO.AccountBook;

@Controller
public class BookController {

	@Autowired
	BookDAO dao;

	@RequestMapping(value = "/insertBoard", method = RequestMethod.POST)
	public @ResponseBody ArrayList<AccountBook> login(AccountBook book, HttpSession session) {

		book.setId((String) session.getAttribute("loginId"));
		System.out.println(book);

		int result = dao.insertBoard(book);

		ArrayList<AccountBook> boardList = dao.selectBoard((String) session.getAttribute("loginId"));

		System.out.println(boardList);

		return boardList;
	}

	@RequestMapping(value = "/boardList", method = RequestMethod.GET)
	public @ResponseBody ArrayList<AccountBook> boardList(HttpSession session) {

		ArrayList<AccountBook> boardList = dao.selectBoard((String) session.getAttribute("loginId"));
		

		return boardList;
	}
	
	@RequestMapping(value = "/updateAmount", method = RequestMethod.POST)
	public @ResponseBody ArrayList<AccountBook> updateAmount(AccountBook book, HttpSession session) {

		System.out.println(book);
		int result = dao.updateReview(book);
		System.out.println(result);
		
		ArrayList<AccountBook> boardList = dao.selectBoard((String)session.getAttribute("loginId"));

		return boardList;
		
	}
}
