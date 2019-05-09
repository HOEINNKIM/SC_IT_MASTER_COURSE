package com.practice.todolist.DAO;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.practice.todolist.VO.Todo;

@Repository
public class TodoDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertTodo(Todo todo) {

		int result = 0;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.insertTodo(todo);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
	}

	public ArrayList<Todo> selectTodo() {

		ArrayList<Todo> result = null;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.selectTodo();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}
	
	public ArrayList<Todo> selectDoing() {

		ArrayList<Todo> result = null;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.selectDoing();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}
	
	public ArrayList<Todo> selectDone() {

		ArrayList<Todo> result = null;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.selectDone();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return result;
	}
	
	public int updateTodoById(String id) {

		int result = 0;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.updateTodoById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
		
	}
	
	public int updateDoingById(String id) {

		int result = 0;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.updateDoingById(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
		
	}
	
	public int deleteDone(String id) {
		
		int result = 0;
		TodoMapper mapper = sqlSession.getMapper(TodoMapper.class);

		try {
			result = mapper.deleteDone(id);
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

		return result;
		
		
	}
	
}
