package com.embeddedcontainer.jetty.Controllers;

import javax.persistence.EntityNotFoundException;
import javax.validation.constraints.NotEmpty;

import com.embeddedcontainer.jetty.Entity.TodoEntity;
import com.embeddedcontainer.jetty.Repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTodo {
    @Autowired
    private TodoRepository todoRepository;

    // Find todo by ID before deleting
    @DeleteMapping("/api/v1/todo/delete/{id}")
    public TodoEntity deleteTodo(@PathVariable @NotEmpty Long id) {
        var todo = todoRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Unable to find todo task with id: " + id));
                
        todoRepository.deleteById(todo.getId());
        return todo;
    }
}
