package com.example.ticketservice.exception;

public class ApiException extends RuntimeException {
    public ApiException(String message) { super(message); }
}