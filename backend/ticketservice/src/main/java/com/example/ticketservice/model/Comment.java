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
public class Comment {
    private Long commentId;
    private String commentUuid;
    private String comment;
    private String status;
    private boolean edited;
    private String userUuid;
    private String firstName;
    private String lastName;
    private String imageUrl;
    private String createdAt;
    private String updatedAt;
}
