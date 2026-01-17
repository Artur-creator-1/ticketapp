package com.example.ticketservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    private Long taskId;
    private String taskUuid;
    private String name;
    private String description;
    private String status;
    private String firstName;
    private String lastName;
    private String imageUrl;
    private String dueDate;
    private String createdAt;
    private String updatedAt;
}