package com.dimserker.kafka.domain.dto;

import com.dimserker.kafka.domain.entity.Message;
import lombok.Data;

@Data
public class MessageDto {

    String topic;
    String description;

    public Message toMessage(){
        return Message.builder()
                .topic(topic)
                .description(description)
                .build();
    }
}
