package com.desafio.java.web.desafioJavaWeb.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Repositories.EventoRepository;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eRepo;
	
	public List<Evento> findAll(){
		return eRepo.findAll();
	}
	
	public Optional<Evento> findById(Long id) {
		return eRepo.findById(id);
	}
}
