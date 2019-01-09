package com.scit.springexercise.DAO;

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
		} catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		return result;
	}
}