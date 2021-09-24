package com.desafio.java.web.desafioJavaWeb.Config;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;
import com.desafio.java.web.desafioJavaWeb.Repositories.EventoRepository;
import com.desafio.java.web.desafioJavaWeb.Repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class configTest implements CommandLineRunner{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private EventoRepository eventoRepository;
	
	@Override
	public void run(String... args) throws Exception{
		Usuario u1 = new Usuario(null, "João Lira");
		Usuario u2 = new Usuario(null, "Emanuel Lima");
		Usuario u3 = new Usuario(null, "Patricia Olivia");
		usuarioRepository.saveAll(Arrays.asList(u1,u2,u3));
		
		Date dataInicio = new Date(), dataFim = new Date();
		Evento e1 = new Evento(null,"Cinema", 30, dataInicio, dataFim);
		Evento e2 = new Evento(null,"Hidro", 15, dataInicio, dataFim);
		Evento e3 = new Evento(null,"Caminhada", 25, dataInicio, dataFim);
		eventoRepository.saveAll(Arrays.asList(e1,e2,e3));
		
		
	}

}
