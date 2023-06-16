package com.reto.twilio.dominio.api;

import com.reto.twilio.dominio.model.MessageModel;

public interface IMessageModelServicePort {

    MessageModel sendMessage(MessageModel messageModel);
}
