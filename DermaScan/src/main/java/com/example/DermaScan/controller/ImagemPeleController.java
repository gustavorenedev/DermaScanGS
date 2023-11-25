package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.ImagemPeleRepository;
import com.example.DermaScan.model.vo.ImagemPele;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/imagem")
public class ImagemPeleController implements BaseController<ImagemPele, Long> {

	@Autowired
    private ImagemPeleRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<ImagemPele, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um nova imagem da pele
    @PostMapping
    public ResponseEntity<ImagemPele> createImagem(@RequestBody ImagemPele imagemPele) {
        try {
            // Salva imagem da pele no repositório
        	ImagemPele saveImagem = repository.save(imagemPele);

            // Retorna imagem da pele criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveImagem, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
