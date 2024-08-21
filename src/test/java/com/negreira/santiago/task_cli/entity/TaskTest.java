package com.negreira.santiago.task_cli.entity;

import com.negreira.santiago.task_cli.domain.entity.Task;
import com.negreira.santiago.task_cli.domain.entity.TaskStatus;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaskTest {

    @Test
    void shouldCreateTask() {
        var id = UUID.randomUUID();
        Task task = new Task(id,"Buy groceries and cook dinner");

        assertEquals(id, task.getId());
        assertEquals("Buy groceries and cook dinner", task.getDescription());
        assertEquals(TaskStatus.PENDING, task.getStatus());
    }

    @Test
    void shouldPutTaskInProgress() {
        var id = UUID.randomUUID();
        Task task = new Task(id, "Buy groceries and cook dinner");
        assertEquals(id, task.getId());
        assertEquals(TaskStatus.PENDING, task.getStatus());

        task.putInProgress();
        assertEquals(TaskStatus.IN_PROGRESS, task.getStatus());
    }

    @Test
    void shouldCompleteTask() {
        var id = UUID.randomUUID();
        Task task = new Task(id, "Buy groceries and cook dinner");
        assertEquals(id, task.getId());
        assertEquals(TaskStatus.PENDING, task.getStatus());

        task.completeTask();
        assertEquals(TaskStatus.DONE, task.getStatus());
    }
}