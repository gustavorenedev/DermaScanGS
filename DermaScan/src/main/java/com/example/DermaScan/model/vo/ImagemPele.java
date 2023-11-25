package com.example.DermaScan.model.vo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/** 
 * @author Gustavo
 * @see Classe que cria objeto capaz de armazenar os dados
 * relativos a Imagem da pele que o usuário irá encaminhar
 * @version 0.1 - 13/11/2023
 */
@Entity
@Table(name = "TB_DS_IMAGEM")
public class ImagemPele {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
    private Long imagem_id;
    private String image;
	
	public ImagemPele() {
	}
	
	/**
	 * @param imagem_id
	 * @param image
	 */
	public ImagemPele(Long imagem_id, String image) {
		this.imagem_id = imagem_id;
		this.image = image;
	}

	/**
	 * @return the imagem_id
	 */
	public Long getImagem_id() {
		return imagem_id;
	}

	/**
	 * @param imagem_id the imagem_id to set
	 */
	public void setImagem_id(Long imagem_id) {
		this.imagem_id = imagem_id;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
