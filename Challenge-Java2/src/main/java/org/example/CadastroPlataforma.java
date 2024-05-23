package org.example;

public interface CadastroPlataforma {
    void fazerCadastro();
    void  cancelarCadastro();
    boolean fazerLogin(String senha, String email);
}
