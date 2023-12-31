package com.reto.twilio.infraestructure.exceptionhandler;

public enum ExceptionResponse {
    NO_DATA_FOUND("No data found for the request");

    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
