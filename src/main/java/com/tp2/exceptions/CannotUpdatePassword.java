package com.tp2.exceptions;

public class CannotUpdatePassword extends RuntimeException {

    public CannotUpdatePassword() {}

    public CannotUpdatePassword(String message) {
        super(message);
    }
}
