package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.ResultadoScanRepository;
import com.example.DermaScan.model.vo.ResultadoScan;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/resultado")
public class ResultadoScanController implements BaseController<ResultadoScan, Long> {

	@Autowired
    private ResultadoScanRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<ResultadoScan, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo resultado
    @PostMapping
    public ResponseEntity<ResultadoScan> createCarga(@RequestBody ResultadoScan resultado) {
        try {
            // Salva resultado no repositório
        	ResultadoScan saveLog = repository.save(resultado);

            // Retorna resultado criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveLog, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
