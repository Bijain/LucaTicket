package com.example.demo.interfaces;

import java.util.List;

import com.example.demo.dto.EventoDTO;

public interface IEventoService {

	public List<EventoDTO> getAll();
	public EventoDTO getEvento(String id);
	public void crearEvento(EventoDTO e);
	public void modificarEvento(EventoDTO e);
	public void eliminarEvento(String id);
	public List<EventoDTO> findByNombre(String nombre);
	public List<EventoDTO> findByDescripcionExtendida(String desc);
	
}
