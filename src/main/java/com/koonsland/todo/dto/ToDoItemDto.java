package com.koonsland.todo.dto;

import org.springframework.lang.NonNull;

public record ToDoItemDto(@NonNull String title, @NonNull String description) {
}
