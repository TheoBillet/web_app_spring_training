package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {
    private TodoRepository todoRepository;

    public TodoListController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping
    public void addTodo(@RequestBody TodoEntity todoEntity) {
        this.todoRepository.save(todoEntity);
    }

    @GetMapping
    public Iterable<TodoEntity> getTodos() {
        return this.todoRepository.findAll();
    }
}
