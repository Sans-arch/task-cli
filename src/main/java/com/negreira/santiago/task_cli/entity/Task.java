package com.negreira.santiago.task_cli.entity;

public class Task {
    private String id;
    private String description;
    private TaskStatus status;

    public Task(String id, String description) {
        this.id = id;
        this.description = description;
        this.status = TaskStatus.PENDING;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void putInProgress() {
        this.status = TaskStatus.IN_PROGRESS;
    }

    public void completeTask() {
        this.status = TaskStatus.DONE;
    }
}
