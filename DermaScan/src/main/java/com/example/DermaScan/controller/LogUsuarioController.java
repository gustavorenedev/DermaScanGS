package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.LogUsuarioRepository;
import com.example.DermaScan.model.vo.LogUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/log-usuario")
public class LogUsuarioController implements BaseController<LogUsuario, Long> {

	@Autowired
    private LogUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<LogUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo log
    @PostMapping
    public ResponseEntity<LogUsuario> createLog(@RequestBody LogUsuario logUsuario) {
        try {
            // Salva log no repositório
        	LogUsuario saveLog = repository.save(logUsuario);

            // Retorna log criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveLog, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
