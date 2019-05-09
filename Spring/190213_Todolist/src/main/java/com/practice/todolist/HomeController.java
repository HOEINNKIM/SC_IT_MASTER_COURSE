package com.practice.todolist;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.todolist.DAO.TodoDAO;
import com.practice.todolist.VO.Todo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	@Autowired
	TodoDAO dao;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {

		
		ArrayList<Todo> todoList = dao.selectTodo();
		model.addAttribute("todo", todoList);
		
		ArrayList<Todo> DoingList = dao.selectDoing();
		model.addAttribute("doing", DoingList);
		
		ArrayList<Todo> DoneList = dao.selectDone();
		model.addAttribute("done", DoneList);

		
		return "home";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String create() {
			
		return "create";
	}

	@RequestMapping(value = "/createTodo", method = RequestMethod.POST)
	public String createTodo(Todo todo) {
		System.out.println(todo.toString());
		//title, name, seq를 받아온다.
		dao.insertTodo(todo);
		
		return "redirect:/";
	}

	@RequestMapping(value = "/moveTodo", method = RequestMethod.POST)
	public String moveTodo(String id) {

		dao.updateTodoById(id);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/moveDoing", method = RequestMethod.POST)
	public String moveDoing(String id) {
		dao.updateDoingById(id);
		
		return "redirect:/";
	}
	
	@RequestMapping(value = "/deleteDone", method = RequestMethod.POST)
	public String deleteDone(String id) {
		dao.deleteDone(id);
		
		return "redirect:/";
	}
	
}
