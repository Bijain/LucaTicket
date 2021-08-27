package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EventoDTO;
import com.example.demo.interfaces.IEventoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api(value="eventoController", description="CRUD de los Eventos")
public class EventoController {

	@Autowired
	IEventoService eventoService;
	
	@ApiOperation(value = "Listado de todos los eventos")
	@GetMapping("/eventos")
	public List<EventoDTO> getAll(){
		return eventoService.getAll();
	}
	
	@ApiOperation(value = "Buscar evento por ID")
	@GetMapping("/eventos/{id}")
	public EventoDTO getEvento(@PathVariable("id") String id) {
		return eventoService.getEvento(id);
	}
	
	@ApiOperation(value = "Buscar eventos por nombre")
	@GetMapping("/eventos/filtroNombre/{nombre}")
	public List<EventoDTO> getEventoByNombre(@PathVariable("nombre") String nombre) {
		return eventoService.findByNombre(nombre);
	}
	
	@ApiOperation(value = "Buscar eventos por descripcion")
	@GetMapping("/eventos/filtroDescripcion/{descripcion}")
	public List<EventoDTO> getEventoByDescripcion(@PathVariable("descripcion") String descripcion) {
		return eventoService.findByDescripcionExtendida(descripcion);
	}
	
	@ApiOperation(value = "Dar de alta un nuevo evento")
	@PostMapping("/evento/alta")
	public void crearEvento(@RequestBody EventoDTO e) {
		eventoService.crearEvento(e);
	}
	
	@ApiOperation(value = "Editar un evento existente")
	@PutMapping("/evento/editar")
	public void modificarEvento(@RequestBody EventoDTO e) {
		eventoService.modificarEvento(e);
	}
	
	@ApiOperation(value = "Eliminar un evento existente por ID")
	@DeleteMapping("/evento/{id}")
	public void eliminarEvento(@PathVariable("id") String id) {
		eventoService.eliminarEvento(id);
	}
}
