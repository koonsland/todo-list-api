package com.koonsland.todo.service;

import com.koonsland.todo.dto.ToDoItemDto;
import com.koonsland.todo.model.ToDoItem;
import com.koonsland.todo.repository.ToDoItemRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ToDoItemService {

    private final ToDoItemRepository toDoItemRepository;

    public ToDoItemService(ToDoItemRepository toDoItemRepository) {
        this.toDoItemRepository = toDoItemRepository;
    }

    /**
     * 모든 할 일 조회
     */
    public List<ToDoItem> findAll() {
        return toDoItemRepository.findAll();
    }

    /**
     * 특정 할 일 조회
     */
    public ToDoItem findById(Long id) {
        return toDoItemRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("할 일을 찾을 수 없어요. id: [" + id +"]"));
    }

    /**
     * 할 일 저장
     */
    @Transactional
    public ToDoItem save(ToDoItemDto toDoItemDto) {
        // 엔티티 생성
        ToDoItem toDoItem = ToDoItem.createToDoItem(toDoItemDto.title(), toDoItemDto.description());

        // 저장
        toDoItemRepository.save(toDoItem);

        return toDoItem;
    }

    /**
     * 할 일 수정
     */
    @Transactional
    public ToDoItem update(Long id, ToDoItemDto toDoItemDto) {
        // 엔티티 조회
        ToDoItem toDoItem = findById(id);

        // 엔티티 수정
        toDoItem.updateTitleAndDescription(toDoItemDto.title(), toDoItemDto.description());

        return toDoItem;
    }

    /**
     * 할 일 삭제 (entity 이용)
     */
    @Transactional
    public void delete(Long id) {
        toDoItemRepository.findById(id)
//                .ifPresent(toDoItem -> toDoItemRepository.delete(toDoItem))
                .ifPresent(toDoItemRepository::delete);
    }

    /**
     * 할 일 삭제 (id 이용)
     */
    @Transactional
    public void deleteById(Long id) {
        toDoItemRepository.deleteById(id);
    }
}
