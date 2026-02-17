package com.nipaaaa.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;

  private String title;
  private boolean done;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

}
