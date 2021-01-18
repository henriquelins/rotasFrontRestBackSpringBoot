package br.com.cea.rotas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cea.rotas.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	List<Usuario> findAll();
	
}
