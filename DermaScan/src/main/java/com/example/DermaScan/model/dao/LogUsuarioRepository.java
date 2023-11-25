package com.example.DermaScan.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.DermaScan.model.vo.LogUsuario;

@Repository
public interface LogUsuarioRepository extends JpaRepository<LogUsuario, Long>{

}
