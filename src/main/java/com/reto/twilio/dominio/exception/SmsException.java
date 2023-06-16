package com.reto.twilio.dominio.exception;

public class SmsException extends RuntimeException{
    public SmsException(String message) {
        super(message);
    }
}
