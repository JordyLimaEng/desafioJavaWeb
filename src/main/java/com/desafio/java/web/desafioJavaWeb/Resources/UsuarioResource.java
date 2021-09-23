package com.desafio.java.web.desafioJavaWeb.Resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.Services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService uService;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAllUsuario() {
		return ResponseEntity.ok().body(uService.findAll());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<Usuario>> findUsuarioById(@PathVariable(value="id") int id) {
		return ResponseEntity.ok().body(uService.findById((long) id));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> saveEvento(@RequestBody Usuario u) {
		return ResponseEntity.ok().body(uService.addUsuario(u));
	}

}
