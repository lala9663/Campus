package com.jpa.todolist.dto;

import com.jpa.todolist.entity.Todo;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TodoResponse {
    private String id;
    private String todos;

    public TodoResponse(Todo todo) {
        this.id = String.valueOf(todo.getId());
        this.todos = todo.getTodos();
    }

}
