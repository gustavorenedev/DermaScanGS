package com.example.DermaScan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.DermaScan.model.dao.DesempenhoScanRepository;
import com.example.DermaScan.model.vo.DesempenhoScan;
import com.example.DermaScan.utils.BaseController;

@RestController
@RequestMapping("/desempenho")
public class DesempenhoScanController implements BaseController<DesempenhoScan, Long> {

	@Autowired
    private DesempenhoScanRepository repository;

    // Implementação do método abstrato da interface BaseController para obter o repositório específico
    @Override
    public JpaRepository<DesempenhoScan, Long> getRepository() {
        return repository;
    }

    // Endpoint para criar um novo desempenho
    @PostMapping
    public ResponseEntity<DesempenhoScan> createDesempenho(@RequestBody DesempenhoScan desempenhoScan) {
        try {
            // Salva desempenho no repositório
        	DesempenhoScan saveDesempenho = repository.save(desempenhoScan);

            // Retorna desempenho criada com o status HTTP 201 (Created)
            return new ResponseEntity<>(saveDesempenho, HttpStatus.CREATED);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
