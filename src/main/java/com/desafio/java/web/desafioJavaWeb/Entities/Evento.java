package com.desafio.java.web.desafioJavaWeb.Entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int vagas;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private LocalDateTime dataInicio;
	
	@JsonFormat(pattern="dd/MM/yyyy HH:mm")
	private LocalDateTime dataFim;

	@ManyToMany(mappedBy="eventos")
	private List<Usuario> usuarios = new ArrayList<>();

	public Evento(Long id, String nome, int vagas, LocalDateTime dataInicio, LocalDateTime dataFim) {
		super();
		this.id = id;
		this.nome = nome;
		this.vagas = vagas;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

}
