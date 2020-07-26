package com.example.demo.service;

import com.example.demo.domain.dto.MessageDto;
import com.example.demo.domain.entity.Message;
import com.example.demo.producer.Producer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final Producer<Message> producer;

    @Override
    public void sendMessage(MessageDto messageDto) {
        Message message = messageDto.toMessage();
        message.setId(UUID.randomUUID());
        producer.send(message);
    }

}
