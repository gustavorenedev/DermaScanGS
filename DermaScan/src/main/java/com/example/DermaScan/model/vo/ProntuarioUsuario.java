package com.example.DermaScan.model.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao prontuario do usuário
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_PRONTUARIO")
public class ProntuarioUsuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prontuario_id;
    private String condicoes_medicas;
    private String medicamentos;
	
	public ProntuarioUsuario() {
		
	}

	/**
	 * @param prontuario_id
	 * @param condicoes_medicas
	 * @param medicamentos
	 */
	public ProntuarioUsuario(Long prontuario_id, String condicoes_medicas, String medicamentos) {
		this.prontuario_id = prontuario_id;
		this.condicoes_medicas = condicoes_medicas;
		this.medicamentos = medicamentos;
	}

	/**
	 * @return the prontuario_id
	 */
	public Long getProntuario_id() {
		return prontuario_id;
	}

	/**
	 * @param prontuario_id the prontuario_id to set
	 */
	public void setProntuario_id(Long prontuario_id) {
		this.prontuario_id = prontuario_id;
	}

	/**
	 * @return the condicoes_medicas
	 */
	public String getCondicoes_medicas() {
		return condicoes_medicas;
	}

	/**
	 * @param condicoes_medicas the condicoes_medicas to set
	 */
	public void setCondicoes_medicas(String condicoes_medicas) {
		this.condicoes_medicas = condicoes_medicas;
	}

	/**
	 * @return the medicamentos
	 */
	public String getMedicamentos() {
		return medicamentos;
	}

	/**
	 * @param medicamentos the medicamentos to set
	 */
	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
}
