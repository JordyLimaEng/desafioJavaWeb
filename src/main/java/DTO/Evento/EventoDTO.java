package DTO.Evento;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.desafio.java.web.desafioJavaWeb.Entities.Evento;
import com.desafio.java.web.desafioJavaWeb.Entities.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private int vagas;
	private Date dataInicio;
	private Date dataFim;
	
	private List<Usuario> usuarios;
	
	public EventoDTO (Evento e) {
		super();
		this.id = e.getId();
		this.nome = e.getNome();
		this.vagas = e.getVagas();
		this.dataInicio = e.getDataInicio();
		this.dataFim = e.getDataFim();
		this.usuarios = e.getUsuarios();
	}
}
