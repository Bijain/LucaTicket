package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.List;

/**
 * 
 * Clase EventoDTO
 * Esta clase hace referencia a la entidad de Evento, para no trabajar directamente con la entidad.
 * @author Grupo 3
 * @version 1.0
 *
 */

public class EventoDTO {

	private String id;
	private String nombre;
	private String descripcionCorta;
	private String descripcionExtendida;
	private String foto;
	private LocalDateTime fecha;
	private List<Double> precios;
	private RecintoDTO recinto;
	
	public EventoDTO() {
		super();
	}

	public EventoDTO(String nombre, String descripcionCorta, String descripcionExtendida, String foto, LocalDateTime fecha, 
			List<Double> precios, RecintoDTO recinto) {
		super();
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

	@Override
	public String toString() {
		return "EventoDTO [id=" + id + ", nombre=" + nombre + ", descripcionCorta=" + descripcionCorta
				+ ", descripcionExtendida=" + descripcionExtendida + ", foto=" + foto + ", fecha=" + fecha 
				+ ", precios=" + precios + ", recinto=" + recinto + "]";
	}
}
