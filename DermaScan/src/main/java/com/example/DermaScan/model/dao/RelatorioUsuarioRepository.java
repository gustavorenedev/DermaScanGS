package com.example.DermaScan.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DermaScan.model.vo.RelatorioUsuario;

@Repository
public interface RelatorioUsuarioRepository extends JpaRepository<RelatorioUsuario, Long>{

}
