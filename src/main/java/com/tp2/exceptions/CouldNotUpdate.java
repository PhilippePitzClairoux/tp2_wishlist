package com.tp2.exceptions;

public class CouldNotUpdate extends RuntimeException {

    public CouldNotUpdate() {
    }

    public CouldNotUpdate(String message) {
        super(message);
    }
}
