package br.com.cea.rotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cea.rotas.dto.UsuarioDTO;
import br.com.cea.rotas.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {
		
	@Autowired
	private UsuarioService service;
	
	@GetMapping
	public ResponseEntity<List<UsuarioDTO>> findAll() {
		List<UsuarioDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
