package com.negreira.santiago.task_cli.infra.persistence.db.mapper;

import com.negreira.santiago.task_cli.domain.entity.Task;
import com.negreira.santiago.task_cli.infra.persistence.db.model.TaskModel;
import org.springframework.stereotype.Component;

@Component
public class TaskMapper {

    public Task mapToDomain(TaskModel taskModel) {
        return new Task(taskModel.getId(), taskModel.getDescription());
    }

    public TaskModel mapToEntity(Task task) {
        return new TaskModel(task.getId(), task.getDescription());
    }
}
