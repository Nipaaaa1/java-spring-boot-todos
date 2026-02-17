package com.nipaaaa.todo.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class TodoRequest {

  @NotNull(message = "Title tidak boleh kosong")
  @Size(min = 3, message = "Title minimal punya 3 karakter")
  private String title;

  private boolean done;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

}
