package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;

public interface BoardMapper {

	//게시판 내용 삽입
	public void insertBoard(Board board);

	//파일 정보 삽입
	public void insertFile(BoardFile file);

	//모든 게시글 선택
	public ArrayList<Board> selectAllBoard(RowBounds rb, String search);

	//시퀀스에 맞는 게시글 선택
	public Board selectBoard(String boardSeq);

	//시퀀스에 맞는 파일 선택
	public ArrayList<BoardFile> selectFile(String boardSeq);

	//전체 보드 갯수 확인
	public int totalCount(String search);
}
