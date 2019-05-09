package com.practice.todolist.DAO;

import java.util.ArrayList;

import com.practice.todolist.VO.Todo;

public interface TodoMapper {

	public int insertTodo(Todo todo);
	
	public ArrayList<Todo> selectTodo();
	
	public ArrayList<Todo> selectDoing();
	
	public ArrayList<Todo> selectDone();
	
	public int updateTodoById(String id);
	
	public int updateDoingById(String id);
	
	public int deleteDone(String id);
	
}
