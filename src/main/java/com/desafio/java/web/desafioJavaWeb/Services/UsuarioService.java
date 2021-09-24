package com.desafio.java.web.desafioJavaWeb.Services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.Repositories.EventoRepository;
import com.desafio.java.web.desafioJavaWeb.Repositories.UsuarioRepository;
import com.desafio.java.web.desafioJavaWeb.Services.Exceptions.ResourceNotFoundException;
import com.desafio.java.web.desafioJavaWeb.Services.utils.UsuarioEvento;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository uRepo;
	
	@Autowired
	private EventoRepository eRepo;
	
	public List<Usuario> findAll(){
		return uRepo.findAll(); 
	}
	
	public Usuario findById(Long id){
		return uRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(id)); 
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
	
	public UsuarioEvento inscrever(Long id, Usuario u) {
		Evento e  = eRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
		Integer vagas = e.getVagas();
		List<Usuario> list = e.getUsuarios();
		LocalDateTime agora = LocalDateTime.now();

		if(list.size() < vagas) {
			e.getUsuarios().add(u);
			return new UsuarioEvento("O usuario "+ u.getNome() +" foi inscrito no evento com sucesso!");
		}
		if (agora.compareTo(e.getDataInicio().plusHours(-1)) >= 0 )  {
			return new UsuarioEvento("Não foi possível inscrever o usuario, data atual depois da expiração!");
		}
		else {
			return new UsuarioEvento("Não foi possível inscrever o usuario, número de vagas excedido!");
		}
	}
	
	public UsuarioEvento desinscrever(Long id, Usuario u) {
		Optional<Evento> opt = eRepo.findById(id);		
		Evento e = opt.orElseThrow(() -> new ResourceNotFoundException(id));
		LocalDateTime agora = LocalDateTime.now();
		
		if(e.getUsuarios().contains(u) &&
				agora.isAfter(e.getDataInicio())) {
			return new UsuarioEvento("Não foi possível cancelar inscrição, data atual é após a expiração do evento!");
		}else {
			e.getUsuarios().remove(u);
			return new UsuarioEvento("Inscrição foi cancelada com sucesso!");
		}
		
		
	}

}
