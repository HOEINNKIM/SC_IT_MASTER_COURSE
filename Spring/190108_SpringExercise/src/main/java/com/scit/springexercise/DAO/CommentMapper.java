package com.scit.springexercise.DAO;

import java.util.ArrayList;

import com.scit.springexercise.VO.Comment;

public interface CommentMapper {

	public int insertComment(Comment comment);
	
	public ArrayList<Comment> selectComment(String boardSeq);
	
	public void updateComment(Comment coment); // ¥Ò±€ ªË¡¶
}
