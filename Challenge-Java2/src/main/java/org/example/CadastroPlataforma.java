package org.example;

public interface CadastroPlataforma {
    boolean fazerCadastro();

    boolean cancelarCadastro(String emailPlataforma, String senhaPlataforma, boolean verificarCerteza);

    boolean fazerLogin(String senha, String email);
}
