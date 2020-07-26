package com.dimserker.kafka.service;


import com.dimserker.kafka.domain.dto.MessageDto;

public interface MessageService {
    void sendMessage(MessageDto message);
}
