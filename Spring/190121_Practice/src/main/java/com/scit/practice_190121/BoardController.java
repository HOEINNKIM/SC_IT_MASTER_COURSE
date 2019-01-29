package com.scit.practice_190121;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.scit.practice_190121.DAO.BoardDAO;
import com.scit.practice_190121.UTIL.PageNavigator;
import com.scit.practice_190121.VO.Board;
import com.scit.practice_190121.VO.Comment;

@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;

	private static final String UPLOAD_PATH = "C:/upload/";
	private int boardPerPage = 5;
	private int pagePerGroup = 3;
	
	
	@RequestMapping(value = "/Board", method = RequestMethod.GET)
	public String Board(Model model) {
		return "redirect:/selectBoard";
	}

	@RequestMapping(value = "/selectBoard", method = RequestMethod.GET)
	public String selectBoard(Model model,
			@RequestParam(value="page", defaultValue="1") int page,
			@RequestParam(value="search", defaultValue="") String search			
			) {

		int totalRecords = dao.countTotal(search);
		
		PageNavigator navi = new PageNavigator(boardPerPage, pagePerGroup, page, totalRecords);
		System.out.println(navi);
		ArrayList<Board> selectBoard = dao.selectAllBoard(navi, search);
		model.addAttribute("board", selectBoard);
		model.addAttribute("navi", navi);
		
		return "Board";
	}

	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write(Board board, Model model) {
		
		return "write";
	}
	
	@RequestMapping(value = "/back", method = RequestMethod.GET)
	public String back() {

		return "redirect:/selectBoard";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(Model model, Board board, MultipartFile files) {

		if(dao.selectBoard(board.getBoardSeq())!=null) {
			dao.updateWrite(board);
			model.addAttribute("board", board);
			System.out.println(123);
			return "detail";
		} else {
			
			String orgName = files.getOriginalFilename();
			SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
			Date date = new Date();
			String fileName = sdf.format(date);
			String ext = orgName.split("\\.")[orgName.split("\\.").length-1];
			String timeName = fileName + "." + ext;
			
			try {
				files.transferTo(new File(UPLOAD_PATH + "timeName" + "." +  ext));			
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			board.setOrgName(orgName);
			board.setFileName(timeName);
			
			dao.insertBoard(board);		
			model.addAttribute("board", board);
			
			
			
			return "detail";
		}
	}

	@RequestMapping(value = "/detail", method = { RequestMethod.GET, RequestMethod.POST })
	public String datail(String boardSeq, Model model) {
		if(boardSeq==null) {
			boardSeq=(String)model.asMap().get("boardSeq");			
		}
		Board board = dao.selectBoard(boardSeq);
		model.addAttribute("board", board);
		
		ArrayList<Comment> selectedComment = dao.selectComment(boardSeq);
		model.addAttribute("Comment", selectedComment);
		return "detail";
	}
	
	@RequestMapping(value = "/insertComment", method = { RequestMethod.GET, RequestMethod.POST })
	public String insertComment(HttpSession session, Comment comment, Model model) {
		
		comment.setId((String)session.getAttribute("loginId"));
		dao.insertComment(comment);
		model.addAttribute("boardSeq", comment.getBoardSeq());

		return "forward:/detail";
		//return "redirect:/detail?boardSeq="+comment.getBoardSeq();

	}	
	
	@RequestMapping(value = "/updateWrite", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateWrite(Board board, Model model) {
		System.out.println(board);
		model.addAttribute("board", board);
		return "write";
	}	
	
	@RequestMapping(value = "/deleteWrite", method = { RequestMethod.GET, RequestMethod.POST })
	public String deleteWrite(String boardSeq) {
		int result = dao.deleteWrite(boardSeq);
		return "redirect:/selectBoard";
	}
}