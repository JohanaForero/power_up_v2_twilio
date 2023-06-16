package com.reto.twilio.application.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class RequestMessageDto {
    @NotBlank(message = "Cellphone number is required")
    @Pattern(regexp = "^\\+57\\d{10}$", message = "The number must start with +57 followed by 10 digits (Colombian number)")
    private String number;
    @NotBlank(message = "The message is required")
    private String message;

    public RequestMessageDto() {
    }

    public RequestMessageDto(String number, String message) {
        this.number = number;
        this.message = message;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
