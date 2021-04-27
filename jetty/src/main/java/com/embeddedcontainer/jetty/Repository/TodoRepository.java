package com.embeddedcontainer.jetty.Repository;

import com.embeddedcontainer.jetty.Entity.TodoEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {

}
