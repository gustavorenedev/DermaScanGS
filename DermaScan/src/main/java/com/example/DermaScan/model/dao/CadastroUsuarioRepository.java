package com.example.DermaScan.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.DermaScan.model.vo.CadastroUsuario;

//Interface que estende JpaRepository para operações CRUD em entidades Usuário com chave primária Long
public interface CadastroUsuarioRepository extends JpaRepository<CadastroUsuario, Long>{
    // Método personalizado para verificar se um cliente com o CPF fornecido já existe
    boolean existsByCpf(String cpf);
}
