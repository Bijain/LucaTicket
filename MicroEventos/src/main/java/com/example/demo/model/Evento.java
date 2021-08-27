package com.example.demo.model;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.example.demo.dto.EventoDTO;
import com.example.demo.dto.RecintoDTO;

//https://www.java67.com/2016/04/how-to-convert-string-to-localdatetime-in-java8-example.html

public class Evento {

	@Id
	private String id;
	private String nombre;
	private String descripcionCorta;
	private String descripcionExtendida;
	private String foto;
	private LocalDateTime fecha;
	private List<Double> precios;
	private RecintoDTO recinto;
	
	public Evento() {
		super();
	}

	public Evento(EventoDTO e) {
		super();
		this.id = e.getId();
		this.nombre = e.getNombre();
		this.descripcionCorta = e.getDescripcionCorta();
		this.descripcionExtendida = e.getDescripcionExtendida();
		this.foto = e.getFoto();
		this.fecha = e.getFecha();
		this.precios = e.getPrecios();
		this.recinto = e.getRecinto();
	}

	public Evento(String id,String nombre, String descripcionCorta, String descripcionExtendida, String foto, LocalDateTime fecha,
			List<Double> precios, RecintoDTO recinto) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcionCorta = descripcionCorta;
		this.descripcionExtendida = descripcionExtendida;
		this.foto = foto;
		this.fecha = fecha;
		this.precios = precios;
		this.recinto = recinto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcionCorta() {
		return descripcionCorta;
	}

	public void setDescripcionCorta(String descripcionCorta) {
		this.descripcionCorta = descripcionCorta;
	}

	public String getDescripcionExtendida() {
		return descripcionExtendida;
	}

	public void setDescripcionExtendida(String descripcionExtendida) {
		this.descripcionExtendida = descripcionExtendida;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<Double> getPrecios() {
		return precios;
	}

	public void setPrecios(List<Double> precios) {
		this.precios = precios;
	}

	public RecintoDTO getRecinto() {
		return recinto;
	}

	public void setRecinto(RecintoDTO recinto) {
		this.recinto = recinto;
	}
	
}
