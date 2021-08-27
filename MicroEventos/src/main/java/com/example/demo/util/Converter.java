package com.example.demo.util;

import java.util.List;
import java.util.stream.Collectors;

import com.example.demo.dto.EventoDTO;
import com.example.demo.model.Evento;

/**
 * Clase Converter
 * Esta clase se usa para convertir las entidades a objetos planos y viceversa.
 * @author Grupo 3
 * @version 1.0
 */
public class Converter {

	public static List<EventoDTO> convertirListaEventos(List<Evento> eventos) {
		return eventos.stream().map(EventoDTO::new).collect(Collectors.toList());
	}
	
	public static EventoDTO eventoToEventoDTO(Evento e) {
		return new EventoDTO(e);
	}
	
	public static Evento eventoDTOToEvento(EventoDTO e) {
		return new Evento(e);
	}
}
