package com.reto.twilio.infraestructure.configuration;

import com.reto.twilio.dominio.api.IMessageModelServicePort;
import com.reto.twilio.dominio.spi.IMessagePersistencePort;
import com.reto.twilio.dominio.usecase.TwilioUseCase;
import com.reto.twilio.infraestructure.adapter.TwilioMessageAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanMessage {

    @Bean
    public IMessagePersistencePort smsMessageTwilio(){
        return new TwilioMessageAdapter();
    }

    @Bean
    public IMessageModelServicePort smsMessageServicePort(){
        return new TwilioUseCase(smsMessageTwilio());
    }
}
