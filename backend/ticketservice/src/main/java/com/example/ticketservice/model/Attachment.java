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
public class Attachment {
    private Long fileId;
    private String fileUuid;
    private String name;
    private String extension;
    private String formattedSize;
    private Long size;
    private String uri;
    private String createdAt;
    private String updatedAt;
}