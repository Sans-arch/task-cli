package com.negreira.santiago.task_cli.domain.service;

import com.negreira.santiago.task_cli.domain.entity.Task;
import com.negreira.santiago.task_cli.domain.repository.TaskRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;

class TaskServiceTest {

    @Test
    void shouldCreateTask() {
        TaskRepository mockTaskRepository = Mockito.mock(TaskRepository.class);
        TaskService taskService = new TaskService(mockTaskRepository);

        taskService.createTask("new task to be created");

        Mockito.verify(mockTaskRepository, times(1)).save(Mockito.any(Task.class));
    }

    @Test
    void shouldNotCreateTaskWithEmptyDescription() {
        TaskRepository mockTaskRepository = Mockito.mock(TaskRepository.class);
        TaskService taskService = new TaskService(mockTaskRepository);

        assertThrows(IllegalArgumentException.class, () -> taskService.createTask(""));
        Mockito.verify(mockTaskRepository, Mockito.never()).save(any());
    }

    @Test
    void shouldNotCreateTaskWithNullDescription() {
        TaskRepository mockTaskRepository = Mockito.mock(TaskRepository.class);
        TaskService taskService = new TaskService(mockTaskRepository);

        assertThrows(IllegalArgumentException.class, () -> taskService.createTask(null));
        Mockito.verify(mockTaskRepository, Mockito.never()).save(any());
    }

}