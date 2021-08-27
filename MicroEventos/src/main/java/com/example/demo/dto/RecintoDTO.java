package com.example.demo.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * Clase RecintoDTO
 * Esta clase guarda los datos del recinto de cada evento.
 * @author Grupo 3
 * @version 1.0
 */

public class RecintoDTO {

	@ApiModelProperty(notes = "Nombre del recinto")
	private String nombre;
	@ApiModelProperty(notes = "Lugar del recinto")
	private String lugar;
	@ApiModelProperty(notes = "Direccion del recinto")
	private String direccion;
	@ApiModelProperty(notes = "Maximo de personas en el recinto")
	private int aforo;
	
	public RecintoDTO() {
		super();
	}

	public RecintoDTO(String nombre, String lugar, String direccion, int aforo) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.direccion = direccion;
		this.aforo = aforo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getAforo() {
		return aforo;
	}

	public void setAforo(int aforo) {
		this.aforo = aforo;
	}

	@Override
	public String toString() {
		return "RecintoDTO [nombre=" + nombre + ", lugar=" + lugar + ", direccion=" + direccion + ", aforo=" + aforo
				+ "]";
	}
	
}
