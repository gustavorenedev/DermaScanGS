package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.InformacoesUsuarioRepository;
import com.example.DermaScan.model.vo.InformacoesUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/informacoes")
public class InformacoesUsuarioController implements BaseController<InformacoesUsuario, Long> {

	@Autowired
    private InformacoesUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<InformacoesUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novas informacoes
    @PostMapping
    public ResponseEntity<InformacoesUsuario> Informacoes(@RequestBody InformacoesUsuario informacoesUsuario) {
        try {
            // Salva informacoes no repositório
        	InformacoesUsuario saveInformacoes = repository.save(informacoesUsuario);

            // Retorna informacoes criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveInformacoes, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

