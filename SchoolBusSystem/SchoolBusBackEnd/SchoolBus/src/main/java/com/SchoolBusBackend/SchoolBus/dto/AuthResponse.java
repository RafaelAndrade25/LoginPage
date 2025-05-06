package com.SchoolBusBackend.SchoolBus.dto;

public class AuthResponse {

    private boolean success;
    private String message;
    private UserDto user;

    // Construtores
    public AuthResponse() {
    }

    public AuthResponse(boolean success, String message, UserDto user) {
        this.success = success;
        this.message = message;
        this.user = user;
    }

    // Getters e Setters
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}