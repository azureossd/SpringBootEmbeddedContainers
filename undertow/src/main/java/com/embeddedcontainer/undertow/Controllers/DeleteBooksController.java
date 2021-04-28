package com.embeddedcontainer.undertow.Controllers;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;

import com.embeddedcontainer.undertow.Entities.BookEntity;
import com.embeddedcontainer.undertow.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteBooksController {
    @Autowired
    private BookRepository bookRepository;

    // Delete a book by ID
    @DeleteMapping("/api/v1/books/delete/{id}")
    public BookEntity deleteBook(@PathVariable @Valid long id) {
        var book = bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Unable to find book with id: " + id));
        bookRepository.deleteById(book.getId());
        return book;
    }
}
