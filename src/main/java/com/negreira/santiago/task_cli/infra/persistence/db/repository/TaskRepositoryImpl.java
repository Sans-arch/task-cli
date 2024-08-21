package com.negreira.santiago.task_cli.infra.persistence.db.repository;

import com.negreira.santiago.task_cli.domain.entity.Task;
import com.negreira.santiago.task_cli.domain.repository.TaskRepository;
import com.negreira.santiago.task_cli.infra.persistence.db.mapper.TaskMapper;
import com.negreira.santiago.task_cli.infra.persistence.db.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class TaskRepositoryImpl implements TaskRepository {
    private final JpaRepository<TaskModel, UUID> taskRepositoryJpa;
    private final TaskMapper taskMapper;

    public TaskRepositoryImpl(JpaRepository<TaskModel, UUID> taskRepositoryJpa, TaskMapper taskMapper) {
        this.taskRepositoryJpa = taskRepositoryJpa;
        this.taskMapper = taskMapper;
    }

    @Override
    public Task findById(UUID id) {
        Optional<TaskModel> entity = taskRepositoryJpa.findById(id);
        return entity.map(taskMapper::mapToDomain).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    @Override
    public List<Task> findAll() {
        List<TaskModel> entities = taskRepositoryJpa.findAll();
        return entities.stream()
                .map(taskMapper::mapToDomain)
                .toList();
    }

    @Override
    public void save(Task task) {
        TaskModel taskEntity = taskMapper.mapToEntity(task);
        taskRepositoryJpa.save(taskEntity);
    }

    @Override
    public void delete(Task task) {
        TaskModel taskModel = taskMapper.mapToEntity(task);
        taskRepositoryJpa.delete(taskModel);
    }
}
