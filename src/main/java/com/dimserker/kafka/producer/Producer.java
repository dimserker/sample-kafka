package com.dimserker.kafka.producer;

public interface Producer<T> {

    void send(T message);

}
