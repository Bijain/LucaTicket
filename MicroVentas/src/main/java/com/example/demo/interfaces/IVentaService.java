package com.example.demo.interfaces;

import com.example.demo.dto.Response;

public interface IVentaService {
	public Response hacerPago(String numTargeta, double precio);
}
