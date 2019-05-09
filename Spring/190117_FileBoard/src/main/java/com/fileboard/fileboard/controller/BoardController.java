package com.fileboard.fileboard.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.fileboard.fileboard.dao.BoardDAO;
import com.fileboard.fileboard.util.PageNavigator;
import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;


@Controller
public class BoardController {

	@Autowired
	BoardDAO dao;
	
	private static final String UPLOADPATH="C:/upload/";
	private int boardPerPage = 5;
	private int pagePerGroup = 3;
	
	@RequestMapping(value = "/boardWrite", method = { RequestMethod.GET, RequestMethod.POST })
	public String boardWrite() {
		return "boardWrite";
	}
	
	@RequestMapping(value = "/boardDetail", method = { RequestMethod.GET, RequestMethod.POST })
	public String boardDetail(String boardSeq,Model model) {
		
		Board board=dao.selectBoard(boardSeq);
		ArrayList<BoardFile> bf=dao.selectFile(boardSeq);
		BoardFile [] bfList=new BoardFile[bf.size()];
		
		for(int i=0;i<bf.size();i++) {
			bfList[i]=bf.get(i);
		}
		board.setFileList(bfList);
		model.addAttribute("board",board);
		return "boardDetail";
	}
	
	@RequestMapping(value = "/board", method = { RequestMethod.GET, RequestMethod.POST })
	public String board(Model model, 
			@RequestParam(value="page", defaultValue="1") int page,
			@RequestParam(value="search", defaultValue="") String search) {
		
		//RequestParam()�� ���ؼ� �Ķ���Ͱ��� ������ �ʾ��� ��쿡 1�� �� �� �ִ�.
		
		// 1. jsp���� �ܾ�� �������� ���� �ѱ� �� �ְ� ó���� ��
		// 2. ��ȣ�� �����ٰ� �� ���� �ƴ϶�, �ڹٽ�ũ������ ���� �� �ϴ����� ���� �� �ְ� ó���Ѵ�.
		// requestParam���� ó������ ��
		// 3. search�� �Ķ���ͷ� �����Ͽ� mapper�� �Ѱ��ش�.
		// mapper���� totalcount, selectAll mapper�� ������ ���ش�.
		
		int totalCount = dao.totalCount(search);
		
		PageNavigator pn = new PageNavigator(boardPerPage, pagePerGroup, page, totalCount);
		
		ArrayList<Board> bList = dao.selectAllBoard(pn, search);		
		model.addAttribute("bList", bList);
		model.addAttribute("navi", pn);
		
		return "board";	
	
	}
	
	@RequestMapping(value = "/writeContent", method = RequestMethod.POST)
	public String writeContent(HttpSession session,Board board, MultipartFile files) {
		
		//���� ÷�θ� �ϴ� ���
		/*MultipartHttpServletRequest request
		request.getFile("files");*/
		
		//�ϳ��� ���ϸ� �޴¹�
		board.setId((String)session.getAttribute("loginId"));
		dao.insertBoard(board);
		
		//1) �������ϸ� -> ����� ���ϸ�(A.txt -> 2019011813191311.txt)
		/*String name="";*/
		String orgname=files.getOriginalFilename();
		Date date=new Date();	//����ð��� ������ ��� ��ü
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
		String timename =sdf.format(date);	//����� ���ϸ� -> ex) 20190118132134
		
		//Ȯ���ڸ� �������� ���� A.B.C.txt [A][B][C][txt]
		String ext = orgname.split("\\.")[orgname.split("\\.").length-1];
		String name=timename + "." + ext;
		
		try {
			files.transferTo(new File(UPLOADPATH + name));	//����� ���ϸ�
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			BoardFile bf=new BoardFile();
			bf.setOrgname(orgname);
			bf.setName(name);
			
			dao.insertFile(bf);
				
		return "redirect:/board?page=1";
	}
	
	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public void download(HttpServletResponse response,String boardSeq) {
		
		//1. ���ϸ���Ʈ ��������
		ArrayList<BoardFile> fList=dao.selectFile(boardSeq);
		BoardFile file = fList.get(0);
		
		//2. response�� ��� �ٲٱ�		
		try {
			response.setHeader("Content-Disposition", "attachment;filename="+URLEncoder.encode(file.getOrgname(), "utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//3. input, output���� �������ֱ�
		FileInputStream fis;
		ServletOutputStream sos;
		
		try {
			fis=new FileInputStream(UPLOADPATH+file.getName());

			sos=response.getOutputStream();

			FileCopyUtils.copy(fis,sos);
			
			fis.close();
			sos.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
}