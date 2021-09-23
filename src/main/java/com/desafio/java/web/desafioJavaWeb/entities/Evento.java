package com.desafio.java.web.desafioJavaWeb.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity @Data
public class Evento implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id @GeneratedValue
	private Long id;
	private String nome;
	private int vagas;	
	private Date dataInicio;
	private Date dataFim;
	public Evento(Long id, String nome, int vagas, Date dataInicio, Date dataFim) {
		super();
		this.id = id;
		this.nome = nome;
		this.vagas = vagas;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}	
	
}
