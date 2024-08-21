package com.negreira.santiago.task_cli.infra.persistence.db.model;

import com.negreira.santiago.task_cli.domain.entity.TaskStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class TaskModel {
    @Id
    private UUID id;
    private String description;
    private TaskStatus status;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public TaskModel() {}

    public TaskModel(UUID id, String description) {
        this.id = id;
        this.description = description;
        this.status = TaskStatus.PENDING;
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
}
