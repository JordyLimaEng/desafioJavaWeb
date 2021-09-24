package com.desafio.java.web.desafioJavaWeb.Repositories;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
