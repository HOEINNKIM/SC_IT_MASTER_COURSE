package com.scit.springexercise;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.springexercise.DAO.BoardDAO;
import com.scit.springexercise.VO.Board;
import com.scit.springexercise.VO.Member;

@Controller
public class BoardController {

	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	BoardDAO dao;
	
	@RequestMapping(value="/goBoard", method=RequestMethod.POST)
	public String goBoard(HttpSession session, Model model) {
		
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "���ǿ� ��ϵ� �α��� ������ �����ϴ�. �ٽ� �α����ϼ���.");
			return "signIn";
		} else {
			
			return "goBoard";
		}
	}
	
	@RequestMapping(value="/insertBoard", method=RequestMethod.POST)
	public String insertBoard(HttpSession session, Board board, Model model) {
		System.out.println(board.getBoardTitle());
		System.out.println(board.getBoardContent());
		
		
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "���ǿ� ��ϵ� �α��� ������ �����ϴ�. �ٽ� �α����ϼ���.");
			return "signIn";
		} else {
			int result = 0;
			Member member = (Member)session.getAttribute("member");
			board.setId(member.getId());
			result = dao.insertBoard(board);
			System.out.println(board);
			System.out.println(result);
			return "goBoard";
		}
	}
}