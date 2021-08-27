package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Response;
import com.example.demo.dto.TarjetaDTO;
import com.example.demo.interfaces.IVentaService;

@Service
public class VentaService implements IVentaService {

	@Autowired
	List<TarjetaDTO> getTarjetas;
	
	@Autowired
	List<Response> responses;
	
	@Override
	public Response hacerPago(String numTargeta, double precio) {
		System.out.println("Tarjetas existentes: "+getTarjetas);
		System.out.println("Numero tajeta: "+numTargeta+" Precio: "+precio);
		//Comprovamos si viene vacia
		if(numTargeta.isBlank() || numTargeta.isEmpty()) {
			System.out.println("El num tarjeta esta vacio");
			return responses.get(2);
		}
		//Comprovamos si tiene menos o mas de 16 caracteres
		if(numTargeta.length()!=16) {
			System.out.println("La tajeta tiene menos o mas de 16 caracteres");
			return responses.get(2);
		}
		//Comprovamos si existe
		boolean encontrada = false;
		int indexTarjeta = 0;
	    for (TarjetaDTO tarjeta : getTarjetas) {
			if(tarjeta.getNumero().equals(numTargeta)) {
				System.out.println("La tarjeta existe");
				encontrada = true;
				break;
			}
			indexTarjeta++;
		}
	    System.out.println("Index de la tarjeta en la lista de tarjetas: "+indexTarjeta);
	    
	    if(!encontrada) {
	    	System.out.println("La tarjeta no existe");
	    	return responses.get(1);
	    }
	    
	    //En el pago, checkeamos si tiene saldo suficiente
	    if(getTarjetas.get(indexTarjeta).getSaldo()<precio) {
	    	System.out.println("No hay saldo suficiente");
	    	return responses.get(3);
	    }
	    //Si lo tiene, actualizamos el saldo disponible y acabamos el pago
	    else {
	    	System.out.println("STONKS");
	    	getTarjetas.get(indexTarjeta).setSaldo(getTarjetas.get(indexTarjeta).getSaldo() - precio);
	    	System.out.println(getTarjetas);
	    	return responses.get(0);
	    }
	}
}
