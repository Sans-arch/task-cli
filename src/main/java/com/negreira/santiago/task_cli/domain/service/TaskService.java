package com.negreira.santiago.task_cli.domain.service;

import com.negreira.santiago.task_cli.domain.entity.Task;
import com.negreira.santiago.task_cli.domain.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Task createTask(String description) {
        var id = UUID.randomUUID();
        Task task = new Task(id, description);
        taskRepository.save(task);
        return task;
    }

}
