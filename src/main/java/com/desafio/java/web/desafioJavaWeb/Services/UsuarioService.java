package com.desafio.java.web.desafioJavaWeb.Services;

import java.util.List;

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
	
	public Usuario findById(Long id){
		return uRepo.findById(id).get(); 
	}
	
	public Usuario addUsuario(Usuario u) {
		return uRepo.save(u);
	}
	
	public Usuario updateUsuario(Long id, Usuario obj) {
		findById(obj.getId());
		return uRepo.save(obj);
	}

	public void deleteUsuario(Long id) {
		findById(id);
		uRepo.deleteById(id);
	}

}
