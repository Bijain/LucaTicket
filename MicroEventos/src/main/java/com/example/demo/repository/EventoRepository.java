package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Evento;


public interface EventoRepository extends MongoRepository<Evento, String> {

	public List<Evento> findByNombre(String nombre);
	public List<Evento> findByDescripcionExtendida(String desc);
}
