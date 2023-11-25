package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos a Regiao do usuario
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_REGIAO_USUARIO")
public class RegiaoUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long regiao_id;
	private String uf;
	private String bairro;
	private String estado;

    // Construtor padrão sem argumentos
	public RegiaoUsuario() {
	}
	
	/**
	 * @param regiao_id
	 * @param uf
	 * @param bairro
	 * @param cidade
	 */
	public RegiaoUsuario(Long regiao_id, String uf, String bairro, String estado) {
		this.regiao_id = regiao_id;
		this.uf = uf;
		this.bairro = bairro;
		this.estado = estado;
	}

	/**
	 * @return the regiao_id
	 */
	public Long getRegiao_id() {
		return regiao_id;
	}

	/**
	 * @param regiao_id the regiao_id to set
	 */
	public void setRegiao_id(Long regiao_id) {
		this.regiao_id = regiao_id;
	}

	/**
	 * @return the uf
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * @param uf the uf to set
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * @return the bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * @param bairro the bairro to set
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * @return the cidade
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param cidade the cidade to set
	 */
	public void setEstado(String cidade) {
		this.estado = cidade;
	}
	
	
	
}
