package com.negreira.santiago.task_cli.infra.cli.commands;

import com.negreira.santiago.task_cli.domain.service.TaskService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.UUID;

@ShellComponent
public class TaskCommand {
    private final TaskService taskService;

    public TaskCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @ShellMethod(key = "task create", value = "Create a new task")
    public String createTask(@ShellOption String taskDescription) {
        var createdTask = taskService.createTask(taskDescription);
        return "Task created with id: " + createdTask.getId();
    }

    @ShellMethod(key = "task get", value = "Get an existing task")
    public String getTask(@ShellOption UUID id) {
        return taskService.getTask(id).describe();
    }

}
