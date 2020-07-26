package com.dimserker.kafka.controller;

import com.dimserker.kafka.domain.dto.MessageDto;
import com.dimserker.kafka.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/message")
public class MessageController {

    private final MessageService service;

    @PostMapping
    public ResponseEntity<Void> sendMessage(@RequestBody MessageDto message){
        log.info("Consumed message at {}", LocalDateTime.now());
        service.sendMessage(message);

        return ResponseEntity.noContent().build();
    }
}
