package com.desafio.java.web.desafioJavaWeb.Resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Services.EventoService;

@RestController
@RequestMapping(value = "/eventos")
public class EventoResource {

	@Autowired
	private EventoService eService;

	@GetMapping
	public ResponseEntity<List<Evento>> findEventoById() {
		return ResponseEntity.ok().body(eService.findAll());
	}

	@PostMapping
	public ResponseEntity<Evento> saveEvento(@RequestBody Evento e) {
		return ResponseEntity.ok().body(eService.addEvento(e));
	}

}
