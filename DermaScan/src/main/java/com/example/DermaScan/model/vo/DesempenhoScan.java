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
 * relativos ao Desempenho do Scan
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_DESEMPENHO")
public class DesempenhoScan {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DESEMPENHO")
    private Long desempenho_id;
    private float precisao;

    // Construtor padrão sem argumentos
	public DesempenhoScan() {
	}

	/**
	 * @param desempenho_id
	 * @param precisao
	 */
	public DesempenhoScan(Long desempenho_id, Float precisao) {
		this.desempenho_id = desempenho_id;
		this.precisao = precisao;
	}

	/**
	 * @return the desempenho_id
	 */
	public Long getDesempenho_id() {
		return desempenho_id;
	}

	/**
	 * @param desempenho_id the desempenho_id to set
	 */
	public void setDesempenho_id(Long desempenho_id) {
		this.desempenho_id = desempenho_id;
	}

	/**
	 * @return the precisao
	 */
	public Float getPrecisao() {
		return precisao;
	}

	/**
	 * @param precisao the precisao to set
	 */
	public void setPrecisao(Float precisao) {
		this.precisao = precisao;
	}
	
}
