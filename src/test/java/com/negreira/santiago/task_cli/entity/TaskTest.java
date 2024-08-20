package com.negreira.santiago.task_cli.entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void shouldCreateTask() {
        Task task = new Task("1", "Buy groceries and cook dinner");

        assertEquals("1", task.getId());
        assertEquals("Buy groceries and cook dinner", task.getDescription());
        assertEquals(TaskStatus.PENDING, task.getStatus());
    }

    @Test
    void shouldPutTaskInProgress() {
        Task task = new Task("1", "Buy groceries and cook dinner");
        assertEquals(TaskStatus.PENDING, task.getStatus());

        task.putInProgress();
        assertEquals(TaskStatus.IN_PROGRESS, task.getStatus());
    }

    @Test
    void shouldCompleteTask() {
        Task task = new Task("1", "Buy groceries and cook dinner");
        assertEquals(TaskStatus.PENDING, task.getStatus());

        task.completeTask();
        assertEquals(TaskStatus.DONE, task.getStatus());
    }
}