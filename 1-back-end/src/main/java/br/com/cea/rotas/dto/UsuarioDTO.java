package br.com.cea.rotas.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import br.com.cea.rotas.entities.Usuario;

public class UsuarioDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String sobrenome;
	private Date dataDeNascimento;
	private String login;
	private String senha;

	private List<AutomovelDTO> automoveis = new ArrayList<>();

	public UsuarioDTO() {
	}
	
	public UsuarioDTO(Long id, String nome, String sobrenome, Date dataDeNascimento, String login, String senha) {
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.login = login;
		this.senha = senha;
	}
	
	public UsuarioDTO(Usuario entity) {
		id = entity.getId();
		nome = entity.getNome();
		sobrenome = entity.getSobrenome();
		dataDeNascimento = entity.getDataDeNascimento();
		login = entity.getLogin();
		senha = entity.getSenha();
		automoveis = entity.getAutomoveis().stream().map(x -> new AutomovelDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<AutomovelDTO> getAutomoveis() {
		return automoveis;
	}

	public void setAutomoveis(List<AutomovelDTO> automoveis) {
		this.automoveis = automoveis;
	}

}
