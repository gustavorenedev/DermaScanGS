package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.NewsletterRepository;
import com.example.DermaScan.model.vo.Newsletter;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/newsletter")
public class NewsletterController implements BaseController<Newsletter, Long> {

	@Autowired
    private NewsletterRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<Newsletter, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo newsletter
    @PostMapping
    public ResponseEntity<Newsletter> createNewsletter(@RequestBody Newsletter newsletter) {
        try {
            // Salva newsletter no repositório
        	Newsletter saveNewsletter = repository.save(newsletter);

            // Retorna newsletter criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveNewsletter, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}