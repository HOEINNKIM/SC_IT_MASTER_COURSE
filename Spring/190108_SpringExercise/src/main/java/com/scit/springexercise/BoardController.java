package com.scit.springexercise;

import java.util.ArrayList;

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
		
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "���ǿ� ��ϵ� �α��� ������ �����ϴ�. �ٽ� �α����ϼ���.");
			return "signIn";
		} else {
			int result = 0;

			if(board.getBoardSeq()!="") {
				result = dao.updateBoard(board);
				return "boardDetail";
			}
			
			Member member = (Member)session.getAttribute("member");
			board.setId(member.getId());
			result = dao.insertBoard(board);
			
			return "redirect:/boardList";
		}
	}
	
	
	@RequestMapping(value="/viewBoard", method=RequestMethod.POST)
	public String viewBoard(HttpSession session, Model model) {
		
		/*if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "���ǿ� ��ϵ� �α��� ������ �����ϴ�. �ٽ� �α����ϼ���.");
			return "signIn";
		} else {*/
			
		return "redirect:/boardList";
		
	}

	//return "redirect:/boardList"; �� ������ �����Ѵ�.
	//�ݺ��۾��� �ϳ��� �޼���� �����ؼ� �����Ѵ�.
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String boardList(Model model) {
		
		ArrayList<Board> boardList = dao.selectBoard();
		if(boardList==null) {
			model.addAttribute("Info", "���� �Խñ��� �����ϴ�.");
		} else {
			model.addAttribute("boardList", boardList);
		}
	
		return "board";

	}
	
	
	@RequestMapping(value="/boardDetail", method=RequestMethod.GET)
	public String boardDetail(String boardSeq, Model model) {
		try {
			Integer.parseInt(boardSeq);			
		} catch(Exception e) {
			return "redirect:/boardList";
		}
		
		Board result = dao.boardDetail(boardSeq);
		if(result==null) {
			return "redirect:/boardList";
		}		

		int cnt = dao.addHitCount(boardSeq);
		result = dao.boardDetail(boardSeq);
		
		model.addAttribute("board", result);		
		
		return "boardDetail";
	}
	
	@RequestMapping(value="/deleteBoard", method=RequestMethod.GET)
	public String deleteBoard(Board board, HttpSession session, Model model) {
		System.out.println(board);
		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "���ǿ� ��ϵ� �α��� ������ �����ϴ�. �ٽ� �α����ϼ���.");
			return "signIn";
		} else {
			Member member = (Member)session.getAttribute("member");
			board.setId(member.getId());
			result = dao.deleteBoard(board);
			return "redirect:/boardList";
		}
		
		//����� �ڵ�
		//boardSeq�� �Ķ���ͷ� �޾ƿ�.
		//Board board = dao.boardDetail(boardSeq);
		//if(board.getId().equals((String)session.getAttribute("loginId")){
		//	dao.deleteBoard(boardSeq);
		//}
		
	}
	
	@RequestMapping(value="/updateBoard", method=RequestMethod.GET)
	public String updateBoard(Board board, HttpSession session, Model model) {
		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "���ǿ� ��ϵ� �α��� ������ �����ϴ�. �ٽ� �α����ϼ���.");
			return "signIn";
		} else {
			model.addAttribute(board);			
			return "goBoard";
		}
	}
}