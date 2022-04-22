package com.kafka.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.demo.service.Producer;

@RestController
public class KafkaController {

	@Autowired
	private Producer producer;
	
	@PostMapping(value = "/post")
	public void sendMessage(@RequestParam("msg") String message) {
		producer.publishToTopic(message);
	}
}
