package com.desafio.java.web.desafioJavaWeb.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
