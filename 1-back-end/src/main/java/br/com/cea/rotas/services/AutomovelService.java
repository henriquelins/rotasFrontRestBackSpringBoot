package br.com.cea.rotas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.cea.rotas.dto.AutomovelDTO;
import br.com.cea.rotas.entities.Automovel;
import br.com.cea.rotas.repositories.AutomovelRepository;

@Service
public class AutomovelService {

	@Autowired
	private AutomovelRepository repository;
	
	@Transactional(readOnly = true)
	public List<AutomovelDTO> findAll() {
		List<Automovel> list = repository.findAll();	
		return list.stream().map(x -> new AutomovelDTO(x)).collect(Collectors.toList());
	}
}
