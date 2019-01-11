package com.scit.springexercise.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scit.springexercise.VO.Board;

@Component
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertBoard(Board board) {

		int result = 0;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		try {
			result = mapper.insertBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}

	public ArrayList<Board> selectBoard() {

		ArrayList<Board> boardList = null;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		try {
			boardList = mapper.selectBoard();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return boardList;
	}

	public Board boardDetail(String boardSeq) {

		Board board = null;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		try {
			board = mapper.boardDetail(boardSeq);
		} catch (Exception e) {
			return null;
		}

		return board;
	}
	
	public int addHitCount(String boardSeq) {

		int result = 0;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		try {
			result = mapper.addHitCount(boardSeq);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}
	
	public int deleteBoard(Board board) {

		int result = 0;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		try {
			result = mapper.deleteBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}
	
	public int updateBoard(Board board) {

		int result = 0;
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);

		try {
			result = mapper.updateBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}
}