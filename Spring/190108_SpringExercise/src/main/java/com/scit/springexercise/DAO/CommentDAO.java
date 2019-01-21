package com.scit.springexercise.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scit.springexercise.VO.Comment;

@Component
public class CommentDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertComment(Comment comment) {

		int result = 0;
		CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

		try {
			result = mapper.insertComment(comment);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;

	}
	
	public ArrayList<Comment> selectComment(String boardSeq) {

		ArrayList<Comment> commList = null;
		CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

		try {
			commList = mapper.selectComment(boardSeq);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return commList;

	}

	public void updateComment(Comment comment) {
		
		CommentMapper mapper = sqlSession.getMapper(CommentMapper.class);

		try {
			mapper.updateComment(comment);
		} catch (Exception e) {
			e.printStackTrace();
		
		}

	}
	
}