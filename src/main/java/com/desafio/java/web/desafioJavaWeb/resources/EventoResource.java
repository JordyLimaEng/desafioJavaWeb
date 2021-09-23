package com.desafio.java.web.desafioJavaWeb.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.java.web.desafioJavaWeb.entities.Evento;
import com.desafio.java.web.desafioJavaWeb.repositories.EventoRepository;

@RestController
@RequestMapping(value = "/eventos")
public class EventoResource {

	EventoRepository eventoRepository;	
	
	@GetMapping
	public ResponseEntity<List<Evento>> findUsuarioById() {

		return ResponseEntity.ok().body(eventoRepository.findAll());
	}

}
