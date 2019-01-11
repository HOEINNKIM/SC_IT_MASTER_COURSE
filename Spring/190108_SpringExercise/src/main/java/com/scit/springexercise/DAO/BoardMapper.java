package com.scit.springexercise.DAO;

import java.util.ArrayList;

import com.scit.springexercise.VO.Board;

public interface BoardMapper {

	public int insertBoard(Board board);
	
	public ArrayList<Board> selectBoard();
	
	public Board boardDetail(String boardSeq);
	
	public int addHitCount(String boardSeq);
	
	public int deleteBoard(Board board);
	
	public int updateBoard(Board board);

}