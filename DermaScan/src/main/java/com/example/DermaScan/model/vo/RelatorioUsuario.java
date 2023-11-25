package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao relatório do usuário
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_RELATORIO")
public class RelatorioUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long relatorio_id;
	@OneToOne
	private DesempenhoScan desempenho;
	
	public RelatorioUsuario() {
	}

	/**
	 * @param relatorio_id
	 * @param informacoes
	 * @param desempenho
	 */
	public RelatorioUsuario(Long relatorio_id, DesempenhoScan desempenho) {
		this.relatorio_id = relatorio_id;
		this.desempenho = desempenho;
	}

	/**
	 * @return the relatorio_id
	 */
	public Long getRelatorio_id() {
		return relatorio_id;
	}

	/**
	 * @param relatorio_id the relatorio_id to set
	 */
	public void setRelatorio_id(Long relatorio_id) {
		this.relatorio_id = relatorio_id;
	}

	/**
	 * @return the desempenho
	 */
	public DesempenhoScan getDesempenho() {
		return desempenho;
	}

	/**
	 * @param desempenho the desempenho to set
	 */
	public void setDesempenho(DesempenhoScan desempenho) {
		this.desempenho = desempenho;
	}
	
	
}
