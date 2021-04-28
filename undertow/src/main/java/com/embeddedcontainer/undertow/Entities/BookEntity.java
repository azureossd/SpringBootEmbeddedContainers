package com.embeddedcontainer.undertow.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    // Equivalient of Not Null + Not Empty
    @NotEmpty(message = "Value must be not null and not empty")
    // Min/max length of 2-455 characters
    @Size(min = 2, max = 455, message = "Book name must be between 2 and 455 characters long")
    private String book;
    // Equivalient of Not Null + Not Empty
    @NotEmpty(message = "Value must be not null and not empty")
    // Min/max length of 2-455 characters
    @Size(min = 2, max = 455, message = "Author name must be between 2 and 455 characters long")
    private String author;
    // Equivalient of Not Null + Not Empty
    @NotEmpty(message = "Value must be not null and not empty")
    // Min/max length of 2-455 characters
    @Size(min = 2, max = 455, message = "Description must be between 2 and 455 characters long")
    private String description;

    public Long getId() {
        return id;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
