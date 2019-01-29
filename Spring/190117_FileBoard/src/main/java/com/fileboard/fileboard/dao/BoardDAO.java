package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fileboard.fileboard.util.PageNavigator;
import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	public void insertBoard(Board board) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
				
		try {
			mapper.insertBoard(board);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void insertFile(BoardFile file) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
				
		try {
			mapper.insertFile(file);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Board> selectAllBoard(PageNavigator pn, String search) {
		
		ArrayList<Board> result = null;
		
		//RowBounds : mybatis 객체 , 시작 위치, 몇개까지, 원하는 위치에서 몇개까지 가져오는 객체
		RowBounds rb = new RowBounds(pn.getStartBoardPage(), pn.getBoardPerPage());//어디위치부터, 몇개
		
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
				
		try {
			result = mapper.selectAllBoard(rb, search);
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	public Board selectBoard(String boardSeq) {

		Board result = null;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
				
		try {
			result = mapper.selectBoard(boardSeq);
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}

	public ArrayList<BoardFile> selectFile(String boardSeq) {

		ArrayList<BoardFile> result = null;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
				
		try {
			result = mapper.selectFile(boardSeq);
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;
	}	
	
	public int totalCount(String search) {

		int result = 0;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
				
		try {
			result = mapper.totalCount(search);
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		return result;		
	}	
}