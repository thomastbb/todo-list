package com.example.todo.Todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private final List<String> todoList = new ArrayList<>();

    @GetMapping("/todos")
    public List<String> listTodos() {
        return todoList;
    }

    @PostMapping("/todos")
    public void addTodo(@RequestBody String todo) {
        todoList.add(todo);
    }

    @PutMapping("/todos/{id}")
    public void updateTodo(@PathVariable int id, @RequestBody String newTodo) {
        todoList.set(id, newTodo);
    }
}
