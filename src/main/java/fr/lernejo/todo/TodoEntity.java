package fr.lernejo.todo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("todo")
public class TodoEntity {

    @Id
    public Long id;
    public String message;
    public String author;

    // Constructeur, getters, setters

    public TodoEntity() {}

    public TodoEntity(String message, String author) {
        this.message = message;
        this.author = author;
    }
}

