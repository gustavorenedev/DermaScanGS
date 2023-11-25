package com.example.DermaScan.model.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.DermaScan.model.dao.CadastroUsuarioRepository;
import com.example.DermaScan.model.vo.CadastroUsuario;

@Component
public class CadastroBO {

	@Autowired
    private CadastroUsuarioRepository cadastroRepository;
	
    /**
     * Valida um cliente com base em várias regras.
     *
     * @param cliente O cliente a ser validado.
     * @return Uma mensagem de erro se houver problemas de validação, ou null se o cliente for válido.
     */
    public String validarCadastro(CadastroUsuario cadastro) {
    	// Validação do CPF
        if (!validarCPF(cadastro.getCpf())) {
            return "CPF inválido. Deve conter apenas números e ter 11 dígitos.";
        }
        
        // Validação do nome
        if (!validarNome(cadastro.getNome_usuario())) {
            return "Nome inválido. Deve conter pelo menos nome e sobrenome.";
        }
        
        // Validação da senha
        if (!validarSenha(cadastro.getSenha_usuario())) {
            return "Senha inválida. Deve ter até 6 dígitos.";
        }
        
        // Verificação se o CPF já está cadastrado
        if (cpfCadastrado(cadastro.getCpf())) {
            return "CPF já cadastrado.";
        }
        
        // Retorna null se todas as validações passarem, indicando que o cliente é válido
        return null;
    }
    
    /**
     * Valida o formato do CPF.
     *
     * @param cpf O CPF a ser validado.
     * @return True se o CPF for válido, false caso contrário.
     */
    private boolean validarCPF(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }
    
    /**
     * Valida o formato do nome.
     *
     * @param nome O nome a ser validado.
     * @return True se o nome for válido, false caso contrário.
     */
    private boolean validarNome(String nome) {
        return nome != null && nome.trim().split("\\s+").length >= 2;
    }

    /**
     * Valida o formato da senha.
     *
     * @param senha A senha a ser validada.
     * @return True se a senha for válida, false caso contrário.
     */
    private boolean validarSenha(String senha) {
        return senha != null && senha.trim().length() <= 6;
    }
    
    /**
     * Verifica se um CPF já está cadastrado.
     *
     * @param cpf O CPF a ser verificado.
     * @return True se o CPF já estiver cadastrado, false caso contrário.
     */
    private boolean cpfCadastrado(String cpf) {
        return cadastroRepository.existsByCpf(cpf);
    }
}
