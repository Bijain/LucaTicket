package com.example.demo.dto;

public class Request {
	
	private UsuarioDTO u;
	private EventoDTO e;
	private String numTarjeta;
	private int indexPrecio;
	
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(UsuarioDTO u, EventoDTO e, String numTarjeta, int indexPrecio) {
		super();
		this.u = u;
		this.e = e;
		this.numTarjeta = numTarjeta;
		this.indexPrecio = indexPrecio;
	}

	public UsuarioDTO getU() {
		return u;
	}

	public void setU(UsuarioDTO u) {
		this.u = u;
	}

	public EventoDTO getE() {
		return e;
	}

	public void setE(EventoDTO e) {
		this.e = e;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public int getIndexPrecio() {
		return indexPrecio;
	}

	public void setIndexPrecio(int indexPrecio) {
		this.indexPrecio = indexPrecio;
	}

	@Override
	public String toString() {
		return "Request [u=" + u + ", e=" + e + ", numTarjeta=" + numTarjeta + ", indexPrecio=" + indexPrecio + "]";
	}
}
