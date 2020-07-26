package com.dimserker.kafka.domain.entity;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Message {

    UUID id;
    String topic;
    String description;
}
