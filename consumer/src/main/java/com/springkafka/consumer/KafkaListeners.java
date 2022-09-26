package com.springkafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "message",
            groupId = "groupId"
    )
     private void listener(String data){
        System.out.println("Listener received: "+ data + "🎉🎉🎉🎉");
    }
}
