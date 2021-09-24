package com.desafio.java.web.desafioJavaWeb.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.Repositories.EventoRepository;
import com.desafio.java.web.desafioJavaWeb.Repositories.UsuarioRepository;

import DTO.CodigosUsuario;

@Service
public class EventoService {

	@Autowired
	private EventoRepository eRepo;
	
	@Autowired
	private UsuarioRepository uRepo;
	
	public List<Evento> findAll(){
		return eRepo.findAll();
	}
	
	public Evento findById(Long id) {		
		return eRepo.findById(id).orElse(null);
	}
	
	public Evento addEvento(Evento e) {
		return eRepo.save(e);
	}
	
	public Evento updateEvento(Long id, Evento e) {
		findById(e.getId());
		return eRepo.save(e);
	}

	public void deleteEvento(Long id) {
		eRepo.deleteById(id);
	}
	
	
	public Evento addUsuarioToEvento(Long pathId, List<CodigosUsuario> codigosUsuario) {
			Evento e = eRepo.findById(pathId).orElse(null);			
			
			
			
			
		return e;
	}

}
