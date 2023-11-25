package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao Log do usuario
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_LOG_USUARIO")
public class LogUsuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long log_id;
    private String acao;
    private String data;
	
	// Construtor padrão sem argumentos
    public LogUsuario() {
    }

	/**
	 * @param log_id
	 * @param acao
	 * @param data
	 */
	public LogUsuario(Long log_id, String acao, String data) {
		this.log_id = log_id;
		this.acao = acao;
		this.data = data;
	}

	/**
	 * @return the log_id
	 */
	public Long getLog_id() {
		return log_id;
	}

	/**
	 * @param log_id the log_id to set
	 */
	public void setLog_id(Long log_id) {
		this.log_id = log_id;
	}

	/**
	 * @return the acao
	 */
	public String getAcao() {
		return acao;
	}

	/**
	 * @param acao the acao to set
	 */
	public void setAcao(String acao) {
		this.acao = acao;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}
    
    
}
