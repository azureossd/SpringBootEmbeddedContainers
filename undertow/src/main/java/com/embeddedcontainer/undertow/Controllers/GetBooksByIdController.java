package com.embeddedcontainer.undertow.Controllers;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import com.embeddedcontainer.undertow.Entities.BookEntity;
import com.embeddedcontainer.undertow.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetBooksByIdController {
    @Autowired
    private BookRepository bookRepository;

    // Find a specific book by ID
    @GetMapping("/api/v1/books/find/{id}")
    public BookEntity findBookById(@PathVariable @Valid long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Unable to find book with id: " + id));
    }
}
