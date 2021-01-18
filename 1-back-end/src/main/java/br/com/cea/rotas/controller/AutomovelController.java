package br.com.cea.rotas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cea.rotas.dto.AutomovelDTO;
import br.com.cea.rotas.services.AutomovelService;

@RestController
@RequestMapping(value = "/automoveis")
public class AutomovelController {
	
	@Autowired
	private AutomovelService service;
	
	@GetMapping
	public ResponseEntity<List<AutomovelDTO>> findAll() {
		List<AutomovelDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
}
