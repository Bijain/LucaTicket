package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.IVentaService;
import com.example.demo.services.MailService;

@Service
public class Consumer {

	@Autowired
	IVentaService ventaService;
	
	@Autowired
	MailService mailService;

	
	@KafkaListener(topics="eventos", groupId="group_id")
	public String consumir(String mensaje) throws IOException {
		System.out.println("String con datos: "+mensaje);
		mailService.sendEmail(mensaje);
		return "Email enviado!";
		 
	}
}
