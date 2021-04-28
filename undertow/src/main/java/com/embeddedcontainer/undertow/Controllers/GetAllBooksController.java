package com.embeddedcontainer.undertow.Controllers;

import java.util.List;

import com.embeddedcontainer.undertow.Entities.BookEntity;
import com.embeddedcontainer.undertow.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetAllBooksController {
    @Autowired
    private BookRepository bookRepository;

    // Find all books in the database
    @GetMapping("/api/v1/books/all")
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }
}
