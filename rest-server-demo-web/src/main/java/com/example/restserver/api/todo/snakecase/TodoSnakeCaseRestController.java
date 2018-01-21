package com.example.restserver.api.todo.snakecase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import org.dozer.Mapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restserver.domain.model.Todo;
import com.example.restserver.domain.service.todo.TodoService;

@RestController
@RequestMapping("todos/snakecase")
public class TodoSnakeCaseRestController {

    @Inject
    TodoService todoService;
    @Inject
    Mapper beanMapper;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<TodoSnakeCaseResource> getTodos() {
        Collection<Todo> todos = todoService.findAll();
        List<TodoSnakeCaseResource> todoResources = new ArrayList<>();
        for (Todo todo : todos) {
            todoResources.add(beanMapper.map(todo, TodoSnakeCaseResource.class));
        }
        return todoResources;
    }
}
