package com.reto.twilio.dominio.usecase;

import com.reto.twilio.dominio.api.IMessageModelServicePort;
import com.reto.twilio.dominio.model.MessageModel;
import com.reto.twilio.dominio.spi.IMessagePersistencePort;

public class TwilioUseCase implements IMessageModelServicePort {

    private final IMessagePersistencePort messagePersistencePort;

    public TwilioUseCase(IMessagePersistencePort messagePersistencePort){
        this.messagePersistencePort = messagePersistencePort;
    }

    @Override
    public MessageModel sendMessage(MessageModel messageModel) {
        return this.messagePersistencePort.sendSmsMessage(messageModel);
    }
}
