package com.example.restserver.domain.repository.todo;

import java.util.Collection;

import com.example.restserver.domain.model.Todo;

public interface TodoRepository {

    Todo findOne(String todoId);

    Collection<Todo> findAll();

    void create(Todo todo);

    boolean update(Todo todo);

    void delete(Todo todo);

    long countByFinished(boolean finished);
}
