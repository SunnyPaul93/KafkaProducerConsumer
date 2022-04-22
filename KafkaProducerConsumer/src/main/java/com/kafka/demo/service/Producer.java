package com.kafka.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
@Service
public class Producer {
	public static final String topic = "mytopic";

	@Autowired
	private KafkaTemplate<String, String> kafkatemp; // Provide convenient method to publish to Kafka

	public void publishToTopic(String message) {
		System.out.println("Publishing to Topic: " + topic);
		this.kafkatemp.send(topic, message);
	}
}
