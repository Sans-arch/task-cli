package com.negreira.santiago.task_cli.domain.repository;

import java.util.List;

public interface RepositoryInterface<T> {
    void save(T task);
    T get();
    List<T> findAll();
}
