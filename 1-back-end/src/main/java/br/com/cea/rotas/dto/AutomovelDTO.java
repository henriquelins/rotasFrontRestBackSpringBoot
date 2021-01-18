package br.com.cea.rotas.dto;

import java.io.Serializable;
import java.util.Date;

import br.com.cea.rotas.entities.Automovel;

public class AutomovelDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private Date ano;
	private String placa;
	private String modelo;
	private String cor;
	
	public AutomovelDTO() {
		
	}
	
	public AutomovelDTO(Long id, Date ano, String placa, String modelo, String cor) {
		super();
		this.id = id;
		this.ano = ano;
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
	}
	
	public AutomovelDTO(Automovel entity) {
		id = entity.getId();
		ano = entity.getAno();
		placa = entity.getPlaca();
		modelo = entity.getModelo();
		cor = entity.getModelo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getAno() {
		return ano;
	}

	public void setAno(Date ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	
}
