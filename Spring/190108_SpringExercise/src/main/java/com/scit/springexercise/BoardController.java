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
import com.scit.springexercise.DAO.CommentDAO;
import com.scit.springexercise.VO.Board;
import com.scit.springexercise.VO.Comment;
import com.scit.springexercise.VO.Member;

@Controller
public class BoardController {

	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	BoardDAO dao;
	
	@Autowired
	CommentDAO dao2;
	
	@RequestMapping(value="/goBoard", method=RequestMethod.POST)
	public String goBoard(HttpSession session, Model model) {
		
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} else {
			
			
			return "goBoard";
		}
	}
	
	@RequestMapping(value="/insertBoard", method=RequestMethod.POST)
	public String insertBoard(HttpSession session, Board board, Model model) {
		
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
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
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} else {*/
			
		return "redirect:/boardList";
		
	}

	//return "redirect:/boardList"; 이 로직을 실행한다.
	//반복작업은 하나의 메서드로 정리해서 적용한다.
	@RequestMapping(value="/boardList", method=RequestMethod.GET)
	public String boardList(Model model) {
		
		ArrayList<Board> boardList = dao.selectBoard();
		if(boardList==null) {
			model.addAttribute("Info", "아직 게시글이 없습니다.");
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
		selectComment(model, result.getBoardSeq());		
		return "boardDetail";
	}
	
	@RequestMapping(value="/deleteBoard", method=RequestMethod.GET)
	public String deleteBoard(Board board, HttpSession session, Model model) {
		System.out.println(board);
		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} else {
			Member member = (Member)session.getAttribute("member");
			board.setId(member.getId());
			result = dao.deleteBoard(board);
			return "redirect:/boardList";
		}
		
		//강사님 코드
		//boardSeq를 파라미터로 받아옴.
		//Board board = dao.boardDetail(boardSeq);
		//if(board.getId().equals((String)session.getAttribute("loginId")){
		//	dao.deleteBoard(boardSeq);
		//}
		
	}
	
	@RequestMapping(value="/updateBoard", method=RequestMethod.GET)
	public String updateBoard(Board board, HttpSession session, Model model) {
		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} else {
			model.addAttribute(board);			
			return "goBoard";
		}
	}
	
	@RequestMapping(value = "/insertComment", method = RequestMethod.POST)
	public String insertComment(HttpSession session, Comment comment, Model model) {

		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} 
		Member member = (Member)session.getAttribute("member");
		comment.setId(member.getId());
		result = dao2.insertComment(comment);
		
		
		
		Board result2 = dao.boardDetail(comment.getBoardSeq()+"");
		model.addAttribute("board", result2);
		selectComment(model, result2.getBoardSeq());
		return "boardDetail";
	}
	
	
	public void selectComment(Model model, String boardSeq) {
		
		ArrayList<Comment> result;
		result = dao2.selectComment(boardSeq);
		model.addAttribute("commentList", result);
		
		
	}
	
	@RequestMapping(value = "/deleteComment", method = RequestMethod.POST)
	public String deleteComment(HttpSession session, Comment comment, Model model) {

		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} 
		dao2.updateComment(comment);
		
		Board result2 = dao.boardDetail(comment.getBoardSeq()+"");
		model.addAttribute("board", result2);
		selectComment(model, result2.getBoardSeq());
		return "boardDetail";
	}
	
}