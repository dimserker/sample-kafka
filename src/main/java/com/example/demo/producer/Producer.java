package com.example.demo.producer;

public interface Producer<T> {

    void send(T message);

}
