package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao resultado do usuário
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_RESULTADO")
public class ResultadoScan {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long resultado_id;
    private String risco;
	
	public ResultadoScan() {	
	}
	
	/**
	 * @param resultado_id
	 * @param risco
	 */
	public ResultadoScan(Long resultado_id, String risco) {
		this.resultado_id = resultado_id;
		this.risco = risco;
	}

	/**
	 * @return the resultado_id
	 */
	public Long getResultado_id() {
		return resultado_id;
	}

	/**
	 * @param resultado_id the resultado_id to set
	 */
	public void setResultado_id(Long resultado_id) {
		this.resultado_id = resultado_id;
	}

	/**
	 * @return the risco
	 */
	public String getRisco() {
		return risco;
	}

	/**
	 * @param risco the risco to set
	 */
	public void setRisco(String risco) {
		this.risco = risco;
	}
	
	
	
	
}
