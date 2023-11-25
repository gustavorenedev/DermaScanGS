package com.example.DermaScan.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DermaScan.model.vo.ResultadoScan;

@Repository
public interface ResultadoScanRepository extends JpaRepository<ResultadoScan, Long>{

}
