package com.desafio.java.web.desafioJavaWeb.Config;

import java.text.SimpleDateFormat;
import java.util.Arrays;

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
		
	}

}
