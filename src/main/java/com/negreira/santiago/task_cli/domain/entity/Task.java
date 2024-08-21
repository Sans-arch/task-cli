package com.negreira.santiago.task_cli.domain.entity;

import java.util.UUID;

public class Task {
    private final UUID id;
    private final String description;
    private TaskStatus status;

    public Task(UUID id, String description) {
        this.id = id;
        this.description = description;
        this.status = TaskStatus.PENDING;
        this.validate();
    }

    private void validate() {
        if (id == null) {
            throw new IllegalArgumentException("Id cannot be null");
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
    }

    public UUID getId() {
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
