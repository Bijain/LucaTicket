package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Request;
import com.example.demo.dto.Response;
import com.example.demo.interfaces.IVentaService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="ventasController", description="Simula una API de los servicios de pago de un banco")
public class VentasController {
	
	@Autowired
	IVentaService ventaService;
	
	private Producer producer;
	
	@Autowired
	public VentasController(Producer producer) {
		super();
		this.producer = producer;
	}
	
	@ApiOperation(value = "Simula la validacion de la compra de un ticket para un evento")
	@PostMapping("/venta")
	public Response ventaTicket(@RequestBody Request r) {
		Response response = ventaService.hacerPago(r.getNumTarjeta(), r.getE().getPrecios().get(r.getIndexPrecio()));
		if(response.getCodigo()==200) {
			String eventoLocalTime = r.getE().getFecha().toString();
			String[] fecha = eventoLocalTime.split("T");
			//Pasamos al producer todos los datos necesarios como un string
			System.out.println("String enviado: "+r.getU().getMail()+"/"+r.getU().getNombre()+"/"+r.getE().getNombre()+"/"+fecha[0]+"/"+fecha[1].substring(0, 5));
			producer.enviarMensaje(r.getU().getMail()+"/"+r.getU().getNombre()+"/"+r.getE().getNombre()+"/"+fecha[0]+"/"+fecha[1].substring(0, 5));
		}
		return response;
	}
}
