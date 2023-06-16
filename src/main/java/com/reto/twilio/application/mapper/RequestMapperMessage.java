package com.reto.twilio.application.mapper;

import com.reto.twilio.application.dto.RequestMessageDto;
import com.reto.twilio.dominio.model.MessageModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RequestMapperMessage {

    MessageModel toMessageModel(RequestMessageDto requestMessageDto);
}
