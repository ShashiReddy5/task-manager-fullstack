package com.shashi.taskmanager.dto;

import com.shashi.taskmanager.model.TaskPriority;
import com.shashi.taskmanager.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TaskRequest {

    @NotBlank
    private String title;

    private String description;

    private TaskStatus status;

    private TaskPriority priority;

    private Long assigneeId;
}
