package com.springkafka.consumer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	CommandLineRunner commandLineRunner(KafkaTemplate<String,String> kafkaTemplate){
		return args -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Message created!");
				kafkaTemplate.send("message","hello World" + i);
			}
		};
	}
}
