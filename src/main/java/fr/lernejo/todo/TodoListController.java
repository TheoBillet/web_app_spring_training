package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {
    private final List<Todo> todos = new ArrayList<Todo>();

    @PostMapping
    public void add(@RequestBody Todo todo) {
        todos.add(todo);
    }

    @GetMapping
    public Collection<Todo> getTodos() {
        return todos;
    }
}
