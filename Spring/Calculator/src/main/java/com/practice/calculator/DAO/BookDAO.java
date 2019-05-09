package com.practice.calculator.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.calculator.VO.AccountBook;

@Repository
public class BookDAO {

	@Autowired
	SqlSession sqlSession;
	
	public int insertBoard(AccountBook book) {

		int result = 0;
		BookMapper mapper = sqlSession.getMapper(BookMapper.class);

		try {
			result = mapper.insertBoard(book);

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;

	}
	
	public ArrayList<AccountBook> selectBoard(String id) {

		ArrayList<AccountBook> result = null;
		BookMapper mapper = sqlSession.getMapper(BookMapper.class);

		try {
			result = mapper.selectBoard(id);

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return result;

	}
	
	public int updateReview(AccountBook book) {

		int result = 0;
		BookMapper mapper = sqlSession.getMapper(BookMapper.class);

		try {
			result = mapper.updateReview(book);

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		return result;

	}

	
}
