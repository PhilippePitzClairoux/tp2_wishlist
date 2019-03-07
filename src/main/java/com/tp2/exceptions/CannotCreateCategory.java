package com.tp2.exceptions;

public class CannotCreateCategory extends RuntimeException {

    public CannotCreateCategory() { }

    public CannotCreateCategory(String message) {
        super(message);
    }
}
