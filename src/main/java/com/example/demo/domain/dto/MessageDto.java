package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Message;
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
