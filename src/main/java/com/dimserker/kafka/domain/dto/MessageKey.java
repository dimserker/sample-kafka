package com.dimserker.kafka.domain.dto;

import com.dimserker.kafka.domain.entity.Message;
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
