package com.embeddedcontainer.jetty.Controllers;

import java.util.List;

import com.embeddedcontainer.jetty.Entity.TodoEntity;
import com.embeddedcontainer.jetty.Repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllTodos {
    @Autowired
    private TodoRepository todoRepository;

    // Find all todos
    @GetMapping("/api/v1/todo/all")
    public List<TodoEntity> getAllTodos() {
        return todoRepository.findAll();
    }

}
