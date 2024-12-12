package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {

    private final TodoRepository todoRepository;

    // Injection du TodoRepository via le constructeur
    public TodoListController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // Méthode GET pour lister les tâches
    @GetMapping
    public Iterable<TodoEntity> getTodos() {
        return todoRepository.findAll();
    }

    // Méthode POST pour ajouter une nouvelle tâche
    @PostMapping
    public TodoEntity addTodo(@RequestBody TodoEntity todo) {
        return todoRepository.save(todo);
    }

    // Méthode GET pour récupérer une tâche par son ID
    @GetMapping("/{id}")
    public Optional<TodoEntity> getTodoById(@PathVariable Long id) {
        return todoRepository.findById(id);
    }
}

