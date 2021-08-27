package com.example.demo.dto;

public class Response {

	private double codigo;
	private String tipo;
	private String causa;
	private String descripcion;
	
	public Response() {
		super();
	}

	public Response(double codigo, String tipo, String causa, String descripcion) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.causa = causa;
		this.descripcion = descripcion;
	}

	public double getCodigo() {
		return codigo;
	}

	public void setCodigo(double codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCausa() {
		return causa;
	}

	public void setCausa(String causa) {
		this.causa = causa;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Response [codigo=" + codigo + ", tipo=" + tipo + ", causa=" + causa + ", descripcion=" + descripcion
				+ "]";
	}
}
