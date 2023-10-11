package br.com.aislan.todolist.user;

import lombok.Data;

@Data
public class CustomResponse {
  private String message;
  private int status;

  public CustomResponse(String message, int status) {
    this.message = message;
    this.status = status;
  }
}