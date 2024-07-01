package com.koonsland.todo.repository;

import com.koonsland.todo.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoItemRepository extends JpaRepository<ToDoItem, Long> {
}
