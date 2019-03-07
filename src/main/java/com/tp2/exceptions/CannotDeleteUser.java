package com.tp2.exceptions;

public class CannotDeleteUser extends RuntimeException {

    public CannotDeleteUser() {}

    public CannotDeleteUser(String message) {
        super(message);
    }
}
