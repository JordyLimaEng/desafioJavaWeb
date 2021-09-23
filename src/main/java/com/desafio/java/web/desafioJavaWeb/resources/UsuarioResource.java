package com.desafio.java.web.desafioJavaWeb.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.java.web.desafioJavaWeb.entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.repositories.UsuarioRepository;


@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	UsuarioRepository usuarioRepository;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findUsuarioById(){		
		
		return ResponseEntity.ok().body(usuarioRepository.findAll());		
	}
	
	
}
