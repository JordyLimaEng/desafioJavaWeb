package com.desafio.java.web.desafioJavaWeb.config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.desafio.java.web.desafioJavaWeb.entities.Evento;
import com.desafio.java.web.desafioJavaWeb.entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.repositories.EventoRepository;
import com.desafio.java.web.desafioJavaWeb.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class configTest implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Override
	public void run(String... args) throws Exception{
		Usuario u1 = new Usuario(null, "User1");
		Usuario u2 = new Usuario(null, "User2");
		Usuario u3 = new Usuario(null, "User3");
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		Date dataInicio = new Date(), dataFim = new Date();
		Evento e1 = new Evento(null,"Evento1", 10, dataInicio, dataFim);
		Evento e2 = new Evento(null,"Evento2", 20, dataInicio, dataFim);
		Evento e3 = new Evento(null,"Evento3", 30, dataInicio, dataFim);
		eventoRepository.saveAll(Arrays.asList(e1,e2,e3));
		
	}

}
