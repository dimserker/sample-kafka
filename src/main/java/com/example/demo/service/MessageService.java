package com.example.demo.service;


import com.example.demo.domain.dto.MessageDto;

public interface MessageService {
    void sendMessage(MessageDto message);
}
