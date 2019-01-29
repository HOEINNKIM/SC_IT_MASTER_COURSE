package com.scit.practice_190121.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.scit.practice_190121.UTIL.PageNavigator;
import com.scit.practice_190121.VO.Board;
import com.scit.practice_190121.VO.Comment;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertBoard(Board board) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.insertBoard(board);			
		} catch(Exception e) {
			e.printStackTrace();
			return result;
		}
		
		return result;
	}
	
	public ArrayList<Board> selectAllBoard(PageNavigator navi, String search) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<Board> result = null;
		
		RowBounds rb = new RowBounds(navi.getStartOfBoardPage(), navi.getBoardPerPage());
		
		try {
			result = mapper.selectAllBoard(rb, search);			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;

	}
	
	public Board selectBoard(String boardSeq) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		Board result = null;
		
		try {
			result = mapper.selectBoard(boardSeq);		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;

	}
	
	public int insertComment(Comment comment) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.insertComment(comment);
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		return result;
	}
	
	public ArrayList<Comment> selectComment(String boardSeq) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		ArrayList<Comment> result = null;
		
		try {
			result = mapper.selectComment(boardSeq);		
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return result;

	}
	
	public int updateWrite(Board board) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.updateWrite(board);			
		} catch(Exception e) {
			e.printStackTrace();
			return 0;			
		}
		
		return result;		
	}
	
	public int deleteWrite(String boardSeq) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.deleteWrite(boardSeq);			
		} catch(Exception e) {
			e.printStackTrace();
			result = 0;
		}

		return result;		
	}

	public int countTotal(String search) {
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.countTotal(search);			
		} catch(Exception e) {
			e.printStackTrace();
			result = 0;
		}
		return result;				
	}
	
}