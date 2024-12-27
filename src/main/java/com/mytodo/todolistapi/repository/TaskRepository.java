package com.mytodo.todolistapi.repository;

import com.mytodo.todolistapi.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
