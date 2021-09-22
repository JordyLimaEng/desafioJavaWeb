package com.desafio.java.web.desafioJavaWeb.Resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.java.web.desafioJavaWeb.entities.Evento;
import com.desafio.java.web.desafioJavaWeb.entities.Usuario;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findUsuarioById(){
		Long id = 1L;
		String nome = "USUARIO TESTE";
		
		Usuario u = new Usuario();	

		u.setId(id);
		u.setNome(nome);
		
		return ResponseEntity.ok().body(u);		
	}
	
	
}
