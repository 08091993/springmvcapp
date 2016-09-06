package com.vanitha.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanitha.todo.service.TodoService;

@RestController
public class TodoRestController {
    @Autowired
    private TodoService service;

    @RequestMapping(value = "/todos")
    public List<Todo> retrieveAllTodos() {
    	 return service.retrieveTodos("vanitha");
       
    }
    @RequestMapping(value = "/todos/{id}")
    public Todo retrieveAllTodos(@PathVariable int id) {
    	 return service.retrieveTodo(id);
       
    }

}
