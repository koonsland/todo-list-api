package com.koonsland.todo.controller;

import com.koonsland.todo.dto.ToDoItemDto;
import com.koonsland.todo.model.ToDoItem;
import com.koonsland.todo.service.ToDoItemService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class ToDoItemController {

    private final ToDoItemService toDoItemService;

    public ToDoItemController(ToDoItemService toDoItemService) {
        this.toDoItemService = toDoItemService;
    }

    /**
     * 모든 ToDoItem 조회
     */
    @GetMapping
    public List<ToDoItem> getAllToDoItems() {
        return toDoItemService.findAll();
    }

    /**
     * 특정 ID를 이용한 ToDoItem 조회
     */
    @GetMapping("/{id}")
    public ToDoItem getToDoItemById(@PathVariable Long id) {
        return toDoItemService.findById(id);
    }

    /**
     * 할 일 등록
     */
    @PostMapping
    public Long createToDoItem(@RequestBody @Valid ToDoItemDto toDoItemDto) {
        ToDoItem toDoItem = toDoItemService.save(toDoItemDto);
        return toDoItem.getId();
    }

    /**
     * 할 일 수정
     */
    @PatchMapping("/{id}")
    public Long updateToDoItem(@PathVariable Long id, @RequestBody @Valid ToDoItemDto toDoItemDto) {
        ToDoItem toDoItem = toDoItemService.update(id, toDoItemDto);
        return toDoItem.getId();
    }

    /**
     * 할 일 삭제
     */
    @DeleteMapping("/{id}")
    public void deleteToDoItem(@PathVariable Long id) {
        toDoItemService.delete(id);
    }
}
