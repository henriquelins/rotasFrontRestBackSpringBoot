package br.com.cea.rotas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cea.rotas.dto.UsuarioDTO;
import br.com.cea.rotas.entities.Usuario;
import br.com.cea.rotas.repositories.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Transactional(readOnly = true)
	public List<UsuarioDTO> findAll() {
		List<Usuario> list = repository.findAll();	
		return list.stream().map(x -> new UsuarioDTO(x)).collect(Collectors.toList());
	}

}
