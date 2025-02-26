package com.example.kafka.controller;

import com.example.kafka.producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class KafkaController {
    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/test")
    public String sendMessage() {
        String message = "Hello there this is the message.";
        messageProducer.sendMessage("myTopic",message);
        return "Message sent";
}
}
