package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.RegiaoUsuarioRepository;
import com.example.DermaScan.model.vo.RegiaoUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/regiao")
public class RegiaoUsuarioController implements BaseController<RegiaoUsuario, Long> {

	@Autowired
    private RegiaoUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<RegiaoUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um nova regiao
    @PostMapping
    public ResponseEntity<RegiaoUsuario> createRegiao(@RequestBody RegiaoUsuario regiao) {
        try {
            // Salva regiao no repositório
        	RegiaoUsuario saveRegiao = repository.save(regiao);

            // Retorna regiao criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveRegiao, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}