package com.negreira.santiago.task_cli.domain.repository;

import com.negreira.santiago.task_cli.domain.entity.Task;

import java.util.List;
import java.util.UUID;

public interface TaskRepository {
    Task findById(UUID id);
    List<Task> findAll();
    void save(Task task);
    void delete(Task task);
}
