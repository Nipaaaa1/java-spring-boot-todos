package com.nipaaaa.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nipaaaa.todo.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}
