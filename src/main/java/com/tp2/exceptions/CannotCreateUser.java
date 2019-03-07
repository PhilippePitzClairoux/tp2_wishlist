package com.tp2.exceptions;

public class CannotCreateUser extends RuntimeException {

    public CannotCreateUser() {}

    public CannotCreateUser(String message) {
        super(message);
    }
}
