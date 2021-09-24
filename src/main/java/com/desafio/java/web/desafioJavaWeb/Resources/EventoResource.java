package com.desafio.java.web.desafioJavaWeb.Resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.Services.EventoService;
import com.desafio.java.web.desafioJavaWeb.Services.UsuarioService;
import com.desafio.java.web.desafioJavaWeb.Services.utils.UsuarioEvento;

@RestController
@RequestMapping(value = "/eventos")
public class EventoResource {

	@Autowired
	private EventoService eService;
	
	@Autowired
	private UsuarioService uService;	

	@GetMapping
	public ResponseEntity<List<Evento>> findAllEvento() {
		return ResponseEntity.ok().body(eService.findAll());
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Evento> findEventoById(@PathVariable(value = "id") int id) {
		return ResponseEntity.ok().body(eService.findById((long) id));
	}

	@PostMapping
	public ResponseEntity<Evento> saveEvento(@RequestBody Evento e) {
		e = eService.addEvento(e);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(e.getId()).toUri();
		return ResponseEntity.created(uri).body(e);
	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<?> deleteEvento(@PathVariable(value="id") Long id) {
		eService.deleteEvento(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Evento> updateEvento(@PathVariable(value="id") Long id, @RequestBody Evento e){
		e.setId(id);
		e = eService.updateEvento(id, e);
		return ResponseEntity.ok().body(e);
	}
	
	@PostMapping(value = "/{id}")
	public ResponseEntity<UsuarioEvento> inscreverUsuarioNoEvento(@PathVariable Long id, @RequestBody Usuario u) {
		return ResponseEntity.ok().body(uService.inscrever(id, u));
	}

}
