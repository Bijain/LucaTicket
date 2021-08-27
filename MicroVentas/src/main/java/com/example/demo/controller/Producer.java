package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	private String topic = "eventos";
	
	@Autowired
	private KafkaTemplate<String, String> kt;
	
	public void enviarMensaje(String msg) {
		this.kt.send(topic, msg);
	}
	
}
