package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EventoDTO;
import com.example.demo.interfaces.IEventoService;
import com.example.demo.model.Evento;
import com.example.demo.repository.EventoRepository;
import com.example.demo.util.Converter;

/**
 * Clase EventoService
 * Servicio dedicado al CRUD de los Eventos 
 * @author Grupo 3
 * @version 1.0
 *
 */

@Service
public class EventoService implements IEventoService{

	@Autowired
	EventoRepository eventoRepository;
	
	/**
	 * @return List<EventoDTO>. Devuelve una lista con todos los eventos.
	 */
	@Override
	public List<EventoDTO> getAll() {
		return Converter.convertirListaEventos((List<Evento>) eventoRepository.findAll());
	}
	
	/**
	 * @param String id. Evento a devolver 
	 * @return EventoDTO. Devuelve el evento pasado por parametro.
	 */
	@Override
	public EventoDTO getEvento(String id) {
		return Converter.eventoToEventoDTO(eventoRepository.findById(id).orElse(null));
	}

	/**
	 * @param EventoDTO e. Evento a crear
	 */
	@Override
	public void crearEvento(EventoDTO e) {
		eventoRepository.save(Converter.eventoDTOToEvento(e));	
	}

	/**
	 * @param EventoDTO e. Evento a modificar
	 */
	@Override
	public void modificarEvento(EventoDTO e) {
		eventoRepository.save(Converter.eventoDTOToEvento(e));
	}

	/**
	 * @param String id. Evento a eliminar
	 */
	@Override
	public void eliminarEvento(String id) {
		eventoRepository.deleteById(id);
	}

	/**
	 * @param String nombre. Filtro de eventos por el nombre 
	 * @return List<EventoDTO>. Devuelve una lista con todos los eventos filtrados.
	 */
	@Override
	public List<EventoDTO> findByNombre(String nombre) {
		//return Converter.convertirListaEventos((List<Evento>) eventoRepository.findByNombre(nombre));
		List<EventoDTO> eventos = this.getAll();
		return eventos.stream().filter(e -> e.getNombre().toLowerCase().contains(nombre.toLowerCase())).collect(Collectors.toList());
	}

	/**
	 * @param String desc. Filtro de eventos por la descripcion 
	 * @return List<EventoDTO>. Devuelve una lista con todos los eventos filtrados.
	 */
	@Override
	public List<EventoDTO> findByDescripcionExtendida(String desc) {
		//return Converter.convertirListaEventos((List<Evento>) eventoRepository.findByDescripcionExtendida(desc));
		List<EventoDTO> eventos = this.getAll();
		return eventos.stream().filter(e -> e.getDescripcionExtendida().toLowerCase().contains(desc.toLowerCase())).collect(Collectors.toList());
	}
}
