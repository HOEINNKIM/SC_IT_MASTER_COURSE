package com.fileboard.fileboard.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.RowBounds;

import com.fileboard.fileboard.vo.Board;
import com.fileboard.fileboard.vo.BoardFile;

public interface BoardMapper {

	//�Խ��� ���� ����
	public void insertBoard(Board board);

	//���� ���� ����
	public void insertFile(BoardFile file);

	//��� �Խñ� ����
	public ArrayList<Board> selectAllBoard(RowBounds rb, String search);

	//�������� �´� �Խñ� ����
	public Board selectBoard(String boardSeq);

	//�������� �´� ���� ����
	public ArrayList<BoardFile> selectFile(String boardSeq);

	//��ü ���� ���� Ȯ��
	public int totalCount(String search);
}
