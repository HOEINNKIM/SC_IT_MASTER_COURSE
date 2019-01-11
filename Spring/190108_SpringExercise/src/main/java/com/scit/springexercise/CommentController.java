package com.scit.springexercise;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.scit.springexercise.DAO.CommentDAO;
import com.scit.springexercise.VO.Board;
import com.scit.springexercise.VO.Comment;
import com.scit.springexercise.VO.Member;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CommentController {

	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	CommentDAO dao;
	
	@RequestMapping(value = "/insertComment", method = RequestMethod.GET)
	public String insertComment(HttpSession session, Comment comment, Model model) {

		System.out.println(comment);
		int result = 0;
		if(session.getAttribute("member")==null) {
			model.addAttribute("warningSession", "세션에 등록된 로그인 정보가 없습니다. 다시 로그인하세요.");
			return "signIn";
		} else {
			Member member = (Member)session.getAttribute("member");
			comment.setId(member.getId());
			result = dao.insertComment(comment);
			return "boardList";
		}
		
		
		
	}

	@RequestMapping(value="/commentList", method=RequestMethod.GET)
	public String commentList(String boardSeq, Model model) {
		
		ArrayList<Comment> commList = dao.selectComment(boardSeq);
		if(commList==null) {
			model.addAttribute("Info", "아직 댓글이 없습니다.");
		} else {
			model.addAttribute("CommentList", commList);
		}
	
		return "boardDetail";

	}
}