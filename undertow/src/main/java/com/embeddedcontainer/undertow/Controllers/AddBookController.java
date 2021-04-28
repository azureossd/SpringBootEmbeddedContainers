package com.embeddedcontainer.undertow.Controllers;

import javax.validation.Valid;

import com.embeddedcontainer.undertow.Entities.BookEntity;
import com.embeddedcontainer.undertow.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddBookController {
    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/api/v1/books/add")
    public ResponseEntity<BookEntity> addBook(@RequestBody @Valid BookEntity newBook) {
        BookEntity createdBook = bookRepository.save(newBook);
        return new ResponseEntity<BookEntity>(createdBook, HttpStatus.CREATED);
    }
}
