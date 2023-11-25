package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.RelatorioUsuarioRepository;
import com.example.DermaScan.model.vo.RelatorioUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/relatorio")
public class RelatorioUsuarioController implements BaseController<RelatorioUsuario, Long> {

	@Autowired
    private RelatorioUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<RelatorioUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo relatorio
    @PostMapping
    public ResponseEntity<RelatorioUsuario> createCarga(@RequestBody RelatorioUsuario relatorio) {
        try {
            // Salva relatorio no repositório
        	RelatorioUsuario saveLog = repository.save(relatorio);

            // Retorna relatorio criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveLog, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}