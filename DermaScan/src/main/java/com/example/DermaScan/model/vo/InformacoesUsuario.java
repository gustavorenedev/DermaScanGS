package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos as informações do usuário
 * @version 0.1 - 13/11/2023
 */

@Entity
@Table(name = "TB_DS_INFORMACOES")
public class InformacoesUsuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long informacoes_id;
    @ManyToOne(fetch = FetchType.EAGER)
	private CadastroUsuario usuario;
    @ManyToOne(fetch = FetchType.EAGER)
    private ProntuarioUsuario prontuario;
    @ManyToOne(fetch = FetchType.EAGER)
    private Newsletter newsletter;
    @ManyToOne(fetch = FetchType.EAGER)
    private RegiaoUsuario regiao;
    @ManyToOne(fetch = FetchType.EAGER)
    private LogUsuario log;
    @ManyToOne(fetch = FetchType.EAGER)
    private ImagemPele imagem;
    @ManyToOne(fetch = FetchType.EAGER)
    private ResultadoScan resultado;
    @ManyToOne(fetch = FetchType.EAGER)
    private FeedbackUsuario feedback;
    private boolean confirma;
    
    public InformacoesUsuario() {
    	
    }
    
	/**
	 * @param informacoes_id
	 * @param usuario
	 * @param prontuario
	 * @param newsletter
	 * @param regiao
	 * @param log
	 * @param imagem
	 * @param resultado
	 * @param feedback
	 * @param confirma
	 */
	public InformacoesUsuario(Long informacoes_id, CadastroUsuario usuario, ProntuarioUsuario prontuario,
			Newsletter newsletter, RegiaoUsuario regiao, LogUsuario log, ImagemPele imagem, ResultadoScan resultado,
			FeedbackUsuario feedback, boolean confirma) {
		this.informacoes_id = informacoes_id;
		this.usuario = usuario;
		this.prontuario = prontuario;
		this.newsletter = newsletter;
		this.regiao = regiao;
		this.log = log;
		this.imagem = imagem;
		this.resultado = resultado;
		this.feedback = feedback;
		this.confirma = confirma;
	}

	/**
	 * @return the informacoes_id
	 */
	public Long getInformacoes_id() {
		return informacoes_id;
	}

	/**
	 * @param informacoes_id the informacoes_id to set
	 */
	public void setInformacoes_id(Long informacoes_id) {
		this.informacoes_id = informacoes_id;
	}

	/**
	 * @return the usuario
	 */
	public CadastroUsuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(CadastroUsuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the prontuario
	 */
	public ProntuarioUsuario getProntuario() {
		return prontuario;
	}

	/**
	 * @param prontuario the prontuario to set
	 */
	public void setProntuario(ProntuarioUsuario prontuario) {
		this.prontuario = prontuario;
	}

	/**
	 * @return the newsletter
	 */
	public Newsletter getNewsletter() {
		return newsletter;
	}

	/**
	 * @param newsletter the newsletter to set
	 */
	public void setNewsletter(Newsletter newsletter) {
		this.newsletter = newsletter;
	}

	/**
	 * @return the regiao
	 */
	public RegiaoUsuario getRegiao() {
		return regiao;
	}

	/**
	 * @param regiao the regiao to set
	 */
	public void setRegiao(RegiaoUsuario regiao) {
		this.regiao = regiao;
	}

	/**
	 * @return the log
	 */
	public LogUsuario getLog() {
		return log;
	}

	/**
	 * @param log the log to set
	 */
	public void setLog(LogUsuario log) {
		this.log = log;
	}

	/**
	 * @return the imagem
	 */
	public ImagemPele getImagem() {
		return imagem;
	}

	/**
	 * @param imagem the imagem to set
	 */
	public void setImagem(ImagemPele imagem) {
		this.imagem = imagem;
	}

	/**
	 * @return the resultado
	 */
	public ResultadoScan getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(ResultadoScan resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the feedback
	 */
	public FeedbackUsuario getFeedback() {
		return feedback;
	}

	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(FeedbackUsuario feedback) {
		this.feedback = feedback;
	}

	/**
	 * @return the confirma
	 */
	public boolean isConfirma() {
		return confirma;
	}

	/**
	 * @param confirma the confirma to set
	 */
	public void setConfirma(boolean confirma) {
		this.confirma = confirma;
	}
    
    
    
}
