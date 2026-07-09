package com.shashi.taskmanager.repository;

import com.shashi.taskmanager.model.Task;
import com.shashi.taskmanager.model.TaskPriority;
import com.shashi.taskmanager.model.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(TaskStatus status);
    List<Task> findByPriority(TaskPriority priority);
    List<Task> findByAssigneeId(Long assigneeId);
}
