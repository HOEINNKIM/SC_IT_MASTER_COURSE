package com.scit.practice_190121.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.scit.practice_190121.VO.Board;
import com.scit.practice_190121.VO.Comment;

public interface BoardMapper {

	public int insertBoard(Board board);

	public ArrayList<Board> selectAllBoard(RowBounds rb, String search);
	
	public Board selectBoard(String boardSeq);
	
	public int insertComment(Comment comment);
	
	public ArrayList<Comment> selectComment(String boardSeq);
	
	public int updateWrite(Board board);
	
	public int deleteWrite(String boardSeq);
	
	public int countTotal(String search);
}
