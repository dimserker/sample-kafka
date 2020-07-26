package com.dimserker.kafka.producer;

import com.dimserker.kafka.domain.dto.MessageKey;
import com.dimserker.kafka.domain.entity.Message;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageProducer implements Producer<Message> {

    private final KafkaTemplate<MessageKey, Message> kafkaTemplate;

    @Value("${message.topic}")
    private String topic;

    @Override
    public void send(Message message) {
        MessageKey key = new MessageKey(message);
        kafkaTemplate.send(topic, key, message);
        log.info("Produced at {}", LocalDateTime.now());
        log.info("Send message: {} with key: {}", message.toString(), key.toString());
    }
}
