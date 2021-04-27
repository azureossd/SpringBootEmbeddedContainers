package com.embeddedcontainer.jetty.Controllers;

import com.embeddedcontainer.jetty.Entity.TodoEntity;
import com.embeddedcontainer.jetty.Repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddTodo {
    @Autowired
    private TodoRepository todoRepository;

    @PostMapping("/api/v1/todo/add")
    public ResponseEntity<TodoEntity> addTodo(@RequestBody TodoEntity addNewTodo) {
        TodoEntity createdTodo = todoRepository.save(addNewTodo);
        // Return a HTTP 201 (created) with the created Object
        return new ResponseEntity<TodoEntity>(createdTodo, HttpStatus.CREATED);
    }
}
