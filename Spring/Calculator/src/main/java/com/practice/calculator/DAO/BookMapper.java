package com.practice.calculator.DAO;

import java.util.ArrayList;

import com.practice.calculator.VO.AccountBook;

public interface BookMapper {

	public int insertBoard(AccountBook book);
	
	public ArrayList<AccountBook> selectBoard(String id);
	
	public int updateReview(AccountBook book);
}
