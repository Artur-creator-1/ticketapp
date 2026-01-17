package com.example.ticketservice.service;

import com.example.ticketservice.model.User;

import java.util.List;

public interface UserService {
    User getUserByUuid(String userUuid);
    User getTicketUser(String ticketUuid);
    User getAssignee(String ticketUuid);
    List<User> getTechSupports();
}