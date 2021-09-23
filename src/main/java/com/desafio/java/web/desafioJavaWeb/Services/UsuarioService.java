package com.desafio.java.web.desafioJavaWeb.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.Repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository uRepo;
	
	public List<Usuario> findAll(){
		return uRepo.findAll(); 
	}
	
	public Optional<Usuario> findById(Long id){
		return uRepo.findById(id); 
	}

}
