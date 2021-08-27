package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.example.demo.model.Evento;

import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * Clase EventoDTO
 * Esta clase hace referencia a la entidad de Evento, para no trabajar directamente con la entidad.
 * @author Grupo 3
 * @version 1.0
 *
 */

public class EventoDTO {

	@ApiModelProperty(notes = "ID autogenerada del evento")
	private String id;
	@ApiModelProperty(notes = "Nombre del evento")
	private String nombre;
	@ApiModelProperty(notes = "Descripcion corta del evento")
	private String descripcionCorta;
	@ApiModelProperty(notes = "Descripcion larga del evento")
	private String descripcionExtendida;
	@ApiModelProperty(notes = "URL de la foto del evento")
	private String foto;
	@ApiModelProperty(notes = "Fecha (dia y hora) del evento")
	private LocalDateTime fecha;
	@ApiModelProperty(notes = "Listado de precios de las entradas del evento")
	private List<Double> precios;
	@ApiModelProperty(notes = "Recinto donde se hara el evento")
	private RecintoDTO recinto;
	
	public EventoDTO() {
		super();
	}

	public EventoDTO(Evento e) {
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
