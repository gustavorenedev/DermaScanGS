package com.example.DermaScan.model.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados relativos ao Cadastro Usuário
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_USUARIO")
public class CadastroUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuario_id;
	private String nome_usuario;
	private String email_usuario;
    @Column(unique = true)
	private String cpf;
	private String senha_usuario;

	// Construtor padrão sem argumentos
	public CadastroUsuario() {

	}

	/**
	 * @param usuario_id
	 * @param nome_usuario
	 * @param email_usuario
	 * @param cpf_usuario
	 * @param senha_usuario
	 */
	public CadastroUsuario(Long usuario_id, String nome_usuario, String email_usuario, String cpf,
			String senha_usuario) {
		this.usuario_id = usuario_id;
		this.nome_usuario = nome_usuario;
		this.email_usuario = email_usuario;
		this.cpf = cpf;
		this.senha_usuario = senha_usuario;
	}

	/**
	 * @return the usuario_id
	 */
	public Long getUsuario_id() {
		return usuario_id;
	}

	/**
	 * @param usuario_id the usuario_id to set
	 */
	public void setUsuario_id(Long usuario_id) {
		this.usuario_id = usuario_id;
	}

	/**
	 * @return the nome_usuario
	 */
	public String getNome_usuario() {
		return nome_usuario;
	}

	/**
	 * @param nome_usuario the nome_usuario to set
	 */
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	/**
	 * @return the email_usuario
	 */
	public String getEmail_usuario() {
		return email_usuario;
	}

	/**
	 * @param email_usuario the email_usuario to set
	 */
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}

	/**
	 * @return the cpf_usuario
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @param cpf_usuario the cpf_usuario to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return the senha_usuario
	 */
	public String getSenha_usuario() {
		return senha_usuario;
	}

	/**
	 * @param senha_usuario the senha_usuario to set
	 */
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}

	
}
