package com.shashi.taskmanager.dto;

import com.shashi.taskmanager.model.TaskPriority;
import com.shashi.taskmanager.model.TaskStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskResponse {
    private Long id;
    private String title;
    private String description;
    private TaskStatus status;
    private TaskPriority priority;
    private String assigneeUsername;
    private Instant createdAt;
    private Instant updatedAt;
}
