package com.example.ticketservice.dtorequest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TicketRequest {
    private Long ticketId;
    private String TicketUuid;
    private String title;
    private String description;
    private String status;
    private String type;
    private String priority;
    private int fileCount;
    private int commentCount;
    private int progress;
    private String dueDate;
    private String createdAt;
    private String updatedAt;
}