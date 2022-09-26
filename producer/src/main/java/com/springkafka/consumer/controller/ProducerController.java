package com.springkafka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producer")
public class ProducerController {

    @Autowired
    private KafkaTemplate kafkaTemplate;


    @GetMapping("")
    public void publish(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Message created!");
            kafkaTemplate.send("message","hello World" + i);
        }

    }
}
