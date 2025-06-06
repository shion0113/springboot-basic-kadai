package com.example.springkadaitodo.contorller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.springkadaitodo.entity.ToDo;
import com.example.springkadaitodo.service.ToDoService;

@Controller
public class ToDoController {
	private final ToDoService todoService;
	
	public ToDoController(ToDoService todoService) {
		this.todoService = todoService;
	}
	
	@GetMapping("/todo")
	public String showToDoList(Model model) {
		List<ToDo> todoList = todoService.getAllTodos();
		model.addAttribute("todoList",todoList);
		
		return"todoView";
	}

}
