package com.nipaaaa.todo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nipaaaa.todo.model.Todo;
import com.nipaaaa.todo.repository.TodoRepository;

@Service
public class TodoService {

  private final TodoRepository repo;

  public TodoService(TodoRepository repo) {
    this.repo = repo;
  }

  public List<Todo> all() {
    return repo.findAll();
  }

  public Optional<Todo> get(long id) {
    return repo.findById(id);
  }

  public Todo create(Todo todo) {
    return repo.save(todo);
  }

  public Todo update(long id, Todo todo) {
    return repo.findById(id).map(existing -> {
      existing.setTitle(todo.getTitle());
      existing.setDone(todo.getDone());
      return repo.save(existing);
    }).orElseThrow();
  }

  public void delete(long id) {
    repo.deleteById(id);
  }
}
