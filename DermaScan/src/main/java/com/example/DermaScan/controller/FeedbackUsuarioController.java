package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.FeedbackUsuarioRepository;
import com.example.DermaScan.model.vo.FeedbackUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/feedback")
public class FeedbackUsuarioController implements BaseController<FeedbackUsuario, Long> {

	@Autowired
    private FeedbackUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<FeedbackUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo feedback
    @PostMapping
    public ResponseEntity<FeedbackUsuario> createFeedback(@RequestBody FeedbackUsuario feedbackUsuario) {
        try {
            // Salva feedback no repositório
        	FeedbackUsuario saveFeedback = repository.save(feedbackUsuario);

            // Retorna feedback com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveFeedback, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}