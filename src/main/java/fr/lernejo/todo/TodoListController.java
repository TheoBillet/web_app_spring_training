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
    public void add(@RequestBody TodoEntity todoEntity) {
        todoRepository.save(todoEntity);
    }

    @GetMapping
    public Iterable<TodoEntity> getTodos() {
        return todoRepository.findAll();
    }
}
