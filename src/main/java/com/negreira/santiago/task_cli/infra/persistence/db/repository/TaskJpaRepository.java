package com.negreira.santiago.task_cli.infra.persistence.db.repository;

import com.negreira.santiago.task_cli.infra.persistence.db.model.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TaskJpaRepository extends JpaRepository<TaskModel, UUID> {
}
