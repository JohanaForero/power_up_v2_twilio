package com.reto.twilio.application.handler;

import com.reto.twilio.application.dto.RequestMessageDto;

public interface IMessageHandler {

    void sendMessage(RequestMessageDto requestMessageDto);
}
