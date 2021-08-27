package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.dto.Response;
import com.example.demo.dto.TarjetaDTO;

@SpringBootApplication
public class MicroVentasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroVentasApplication.class, args);
	}
	
	@Bean
	public List<TarjetaDTO> getTargetas(){
		List<TarjetaDTO> targetas = new ArrayList();
		TarjetaDTO t1 = new TarjetaDTO("1111222233334444", 1000);
		TarjetaDTO t2 = new TarjetaDTO("1234123412341234", 10);
		targetas.add(t1);
		targetas.add(t2);
		return targetas;
	}
	
	@Bean
	public List<Response> getResponses(){
		List<Response> responses = new ArrayList();
		Response r1 = new Response(200, "information", "Request successful", "The request completed successfully.");
		Response r2 = new Response(400.1000, "error ", "Invalid Account Number", "Check failed on the credit card number. Please check your input and try again.");
		Response r3 = new Response(400.1002, "error ", "Invalid Account Number Length", "The Account Number does not have the correct length. Check Credit Card Number.");
		Response r4 = new Response(500.1058, "error", "Insufficient Funds", "The acquirer returned Insufficient funds. Please check with Issuer, or use different card.");
		responses.add(r1);
		responses.add(r2);
		responses.add(r3);
		responses.add(r4);
		return responses;
	}

}
