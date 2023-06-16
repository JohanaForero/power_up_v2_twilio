package com.reto.twilio.infraestructure.adapter;

import com.reto.twilio.dominio.model.MessageModel;
import com.reto.twilio.dominio.spi.IMessagePersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwilioMessageAdapter implements IMessagePersistencePort {
    @Override
    public MessageModel sendSmsMessage(MessageModel messageModel) {
        return null;
    }
}
