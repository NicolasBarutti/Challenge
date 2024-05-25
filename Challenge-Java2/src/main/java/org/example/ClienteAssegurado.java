package org.example;

import java.util.Date;
import java.util.List;

public class ClienteAssegurado extends Cliente{

    private Seguro seguro;

    public ClienteAssegurado(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento, String descricaoProblema, Carro carro, String emailPlataforma, String senhaPlataforma) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento, descricaoProblema, carro, emailPlataforma, senhaPlataforma);
    }

    public Seguro getSeguro() {
        return seguro;
    }

    private boolean isEmailValido(String email) {
        return email != null && email.contains("@");
    }

    private boolean isSenhaValida(String senha) {
        return senha != null && senha.length() >= 6;
    }

    @Override
    public boolean fazerCadastro() {
        if (!isEmailValido(getEmailPlataforma())) {
            return false;
        }
        else if (!isSenhaValida(getSenhaPlataforma())) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean cancelarCadastro(String email, String senha, boolean verificarCerteza) {
        if (getEmailPlataforma().equals(email) && (getSenhaPlataforma().equals(senha)) && verificarCerteza){
            return true;
        }
        return false;
    }

    @Override
    public boolean fazerLogin(String senha, String email) {
        if (getEmailPlataforma().equals(email) && (getSenhaPlataforma().equals(senha))){
            return true;
        }
        return false;


    }
}
