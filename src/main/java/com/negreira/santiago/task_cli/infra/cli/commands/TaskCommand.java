package com.negreira.santiago.task_cli.infra.cli.commands;

import com.negreira.santiago.task_cli.domain.service.TaskService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class TaskCommand {
    private final TaskService taskService;

    public TaskCommand(TaskService taskService) {
        this.taskService = taskService;
    }

    @ShellMethod(key = "create-task", value = "Create a new task")
    public String createTask(@ShellOption String taskDescription) {
        var createdTask = taskService.createTask(taskDescription);
        return "Task created with id: " + createdTask.getId();
    }

    @ShellMethod(key = "hello", value = "Say hello")
    public String hello(@ShellOption String arg) {
        return "Hello, world " + arg;
    }

    @ShellMethod(key = "goodbye", value = "Say goodbye")
    public String goodbye() {
        return "Goodbye!";
    }
}
