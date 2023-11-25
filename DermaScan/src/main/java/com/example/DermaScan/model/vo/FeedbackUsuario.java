package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos ao feedback do usuário
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_FEEDBACK")
public class FeedbackUsuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedback_id;
    private String feedback;
	
	public FeedbackUsuario() {
	}

	/**
	 * @param feedback_id
	 * @param feedback
	 */
	public FeedbackUsuario(Long feedback_id, String feedback) {
		this.feedback_id = feedback_id;
		this.feedback = feedback;
	}

	/**
	 * @return the feedback_id
	 */
	public Long getFeedback_id() {
		return feedback_id;
	}

	/**
	 * @param feedback_id the feedback_id to set
	 */
	public void setFeedback_id(Long feedback_id) {
		this.feedback_id = feedback_id;
	}

	/**
	 * @return the feedback
	 */
	public String getFeedback() {
		return feedback;
	}

	/**
	 * @param feedback the feedback to set
	 */
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	
}
