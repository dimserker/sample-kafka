package com.example.demo.config.serde;

import com.example.demo.domain.dto.MessageKey;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.serialization.Serializer;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

@Slf4j
public class KeySerializer implements Serializer<MessageKey> {

    @SneakyThrows
    @Override
    public byte[] serialize(String s, MessageKey key) {

        MessageBufferPacker packer = MessagePack.newDefaultBufferPacker();
        packer
                .packString(key.getMessageId().toString())
                .packInt(key.getHashCode());
        byte[] byteKey = packer.toByteArray();
        log.info("Key after serialization: {}", byteKey);
        return byteKey;
    }
}
