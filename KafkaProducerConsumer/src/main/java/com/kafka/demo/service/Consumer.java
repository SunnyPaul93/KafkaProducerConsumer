package com.kafka.demo.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	@KafkaListener(topics = "mytopic" , groupId = "mugroup")
	public void consumeFromTopic(String message) {
		System.out.println("Consumed message :"+message);
	}
}
