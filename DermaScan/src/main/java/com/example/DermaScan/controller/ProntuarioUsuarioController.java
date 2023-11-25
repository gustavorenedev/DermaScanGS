package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.ProntuarioUsuarioRepository;
import com.example.DermaScan.model.vo.ProntuarioUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/prontuario")
public class ProntuarioUsuarioController implements BaseController<ProntuarioUsuario, Long> {

	@Autowired
    private ProntuarioUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<ProntuarioUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo prontuario
    @PostMapping
    public ResponseEntity<ProntuarioUsuario> createProntuario(@RequestBody ProntuarioUsuario prontuario) {
        try {
            // Salva prontuario no repositório
        	ProntuarioUsuario saveProntuario = repository.save(prontuario);

            // Retorna prontuario criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveProntuario, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
