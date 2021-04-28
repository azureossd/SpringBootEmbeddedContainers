package com.embeddedcontainer.undertow.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.embeddedcontainer.undertow.Entities.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

}
