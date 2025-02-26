package com.example.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "myTopic",groupId = "my-group-id")
    public void listen(String message) {
        System.out.println(message);
    }

    @KafkaListener(topics = "myTopic",groupId = "my-group-id-1")
    public void listen1(String message) {
        System.out.println("1 - "+message);
    }

}
