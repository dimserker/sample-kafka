package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Message;
import lombok.Data;

import java.util.UUID;

@Data
public class MessageKey {

    UUID messageId;
    Integer hashCode;

    public MessageKey(Message message) {
        this.messageId = message.getId();
        this.hashCode = message.hashCode();
    }

}
