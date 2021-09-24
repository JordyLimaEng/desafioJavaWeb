package DTO.Usuario;

import java.util.List;

import DTO.Evento.EventoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
	
	private Long id;
	private String nome;
	private List<EventoDTO> eventos;
	
}
