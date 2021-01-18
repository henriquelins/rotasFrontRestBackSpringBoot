package br.com.cea.rotas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cea.rotas.entities.Automovel;

public interface AutomovelRepository extends JpaRepository<Automovel, Long> {
	
	List<Automovel> findAll();
	
}
