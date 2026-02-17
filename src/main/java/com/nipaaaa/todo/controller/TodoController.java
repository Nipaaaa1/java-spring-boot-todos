package com.nipaaaa.todo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nipaaaa.todo.model.Todo;
import com.nipaaaa.todo.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
  private final TodoService service;

  public TodoController(TodoService service) {
    this.service = service;
  }

  @GetMapping
  public List<Todo> all() {
    return service.all();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Todo> one(@PathVariable Long id) {
    return service.get(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
  }

  @PostMapping
  public ResponseEntity<Todo> create(@RequestBody Todo todo) {
    return ResponseEntity.ok(service.create(todo));
  }

  @PutMapping("/{id}")
  public ResponseEntity<Todo> update(@PathVariable long id, @RequestBody Todo todo) {
    try {
      Todo updated = service.update(id, todo);
      return ResponseEntity.ok(updated);
    } catch (Exception e) {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> delete(@PathVariable long id) {
    service.delete(id);
    return ResponseEntity.noContent().build();
  }
}
