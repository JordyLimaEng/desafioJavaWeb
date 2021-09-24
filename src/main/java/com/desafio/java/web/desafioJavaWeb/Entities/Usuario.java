package com.desafio.java.web.desafioJavaWeb.Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario implements Serializable {	

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	@ManyToMany
	@JoinTable(name="USUARIO_EVENTO",
				joinColumns = @JoinColumn(name="usuario"),
				inverseJoinColumns = @JoinColumn(name="evento"))
	private List<Evento> eventos = new ArrayList<>();
		
	public Usuario(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}
}
