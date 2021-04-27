package com.embeddedcontainer.jetty.Controllers;

import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.NotEmpty;

import com.embeddedcontainer.jetty.Entity.TodoEntity;
import com.embeddedcontainer.jetty.Repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetTodoByIdController {
    @Autowired
    private TodoRepository todoRepository;

    // Find todo by ID
    @GetMapping("/api/v1/todo/find/{id}")
    public TodoEntity findTodoById(@PathVariable @NotEmpty Integer id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Unable to find todo task with id: " + id));
    }
}
