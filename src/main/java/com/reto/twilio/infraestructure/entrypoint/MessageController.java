package com.reto.twilio.infraestructure.entrypoint;

import com.reto.twilio.application.dto.RequestMessageDto;
import com.reto.twilio.application.handler.IMessageHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
@RestController
@RequestMapping(value = "/api/v1/sms/message")
@RequiredArgsConstructor
public class MessageController {

    private final IMessageHandler smsMessageHandler;


    @Operation(summary = "Send a new sms message")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Sms message created and sent ", content = @Content),
            @ApiResponse(responseCode = "400", description = "Error sending sms message", content = @Content)
    })
    @PostMapping("/")
    public ResponseEntity<Void> sendSmsMessage(@Valid @RequestBody RequestMessageDto requestMessageDto) {
        smsMessageHandler.sendMessage(requestMessageDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
