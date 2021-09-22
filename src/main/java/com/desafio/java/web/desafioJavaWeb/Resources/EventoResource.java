package com.desafio.java.web.desafioJavaWeb.Resources;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.java.web.desafioJavaWeb.entities.Evento;


@RestController
@RequestMapping(value = "/evento")
public class EventoResource {
	
	@GetMapping
	public ResponseEntity<Evento> findEventoById(){
		Long id = 1L;
		String nome = "teste";
		int vagas = 500;
		Date inicio = new Date();
		Date fim = new Date();	
		
		Evento e = new Evento();		
		
		e.setDataInicio(inicio);
		e.setDataFim(fim);
		e.setId(id);
		e.setNome(nome);
		e.setVagas(vagas);
		
		return ResponseEntity.ok().body(e);		
	}
	
	
}
