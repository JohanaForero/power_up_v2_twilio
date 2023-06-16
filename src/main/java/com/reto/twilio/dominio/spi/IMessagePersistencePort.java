package com.reto.twilio.dominio.spi;

import com.reto.twilio.dominio.model.MessageModel;

public interface IMessagePersistencePort {

    MessageModel sendSmsMessage(MessageModel messageModel);
}
