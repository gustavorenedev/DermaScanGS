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
 * relativos a Newsletter da empresa
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_NEWSLETTER")
public class Newsletter {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_NEWSLETTER")
    private Long newsletter_id;
    private char recebe_newsletter;

	public Newsletter() {
	}

	/**
	 * @param newsletter_id
	 * @param recebe_newsletter
	 */
	public Newsletter(Long newsletter_id, char recebe_newsletter) {
		this.newsletter_id = newsletter_id;
		this.recebe_newsletter = recebe_newsletter;
	}

	/**
	 * @return the newsletter_id
	 */
	public Long getNewsletter_id() {
		return newsletter_id;
	}

	/**
	 * @param newsletter_id the newsletter_id to set
	 */
	public void setNewsletter_id(Long newsletter_id) {
		this.newsletter_id = newsletter_id;
	}

	/**
	 * @return the recebe_newsletter
	 */
	public char isRecebe_newsletter() {
		return recebe_newsletter;
	}

	/**
	 * @param recebe_newsletter the recebe_newsletter to set
	 */
	public void setRecebe_newsletter(char recebe_newsletter) {
		this.recebe_newsletter = recebe_newsletter;
	}
	
	
	
	
}
