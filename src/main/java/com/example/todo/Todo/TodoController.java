package com.example.todo.Todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {

    private final List<ToDo> toDoList = new ArrayList<>();

    @GetMapping("/todos")
    public List<ToDo> listTodos() {
        return toDoList;
    }

    @PostMapping("/todos")
    public void addToDo(@RequestBody ToDo toDoObject) {
        toDoList.add(toDoObject);
    }

    @PutMapping("/todos/{id}")
    public void updateTodo(@PathVariable int id, @RequestBody ToDo newTodo) {
        toDoList.set(id, newTodo);
    }

    @DeleteMapping("/todos/{id}")
    public void deleteTodo(@PathVariable int id) {
        toDoList.removeIf(toDoObject -> toDoObject.id == id);}
}

class ToDo {
    public int id;
    public String title;
}