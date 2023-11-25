package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.CadastroUsuarioRepository;
import com.example.DermaScan.model.vo.CadastroUsuario;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/cadastro-usuario")
public class CadastroUsuarioController implements BaseController<CadastroUsuario, Long> {

	@Autowired
    private CadastroUsuarioRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<CadastroUsuario, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo cadastro
    @PostMapping
    public ResponseEntity<CadastroUsuario> createCadastro(@RequestBody CadastroUsuario cadastroUsuario) {
        try {
            // Salva cadastro no repositório
        	CadastroUsuario saveCadastro = repository.save(cadastroUsuario);

            // Retorna cadastro criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveCadastro, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}