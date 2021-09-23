package com.desafio.java.web.desafioJavaWeb.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;

@Entity @Data
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private Long id;
	private String nome;
	
	public Usuario(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}	
	
}
