package com.example.restserver.api.todo.snakecase;

import com.example.restserver.api.todo.TodoResource;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class TodoSnakeCaseResource extends TodoResource {

    private static final long serialVersionUID = 1L;

}
