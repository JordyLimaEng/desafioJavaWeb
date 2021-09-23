package com.desafio.java.web.desafioJavaWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.java.web.desafioJavaWeb.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
