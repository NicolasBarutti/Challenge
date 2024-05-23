package org.example;

import java.util.Date;

public class ClienteAssegurado extends Cliente{
    private Seguro seguro;

    public ClienteAssegurado(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento, String descricaoProblema, Carro carro, String emailPlataforma, String senhaPlataforma) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento, descricaoProblema, carro, emailPlataforma, senhaPlataforma);
    }

    public Seguro getSeguro() {
        return seguro;
    }

    @Override
    public void fazerCadastro() {
        //precisa do idSeguro
    }

    @Override
    public void cancelarCadastro() {

    }

    @Override
    public boolean fazerLogin(String senha, String email) {
        if (senha.equals(getSenhaPlataforma()) && email.equals(getEmailPlataforma())){
            System.out.println("Login realizado com sucesso!");
            return true;
        } else {
            System.out.println("Email ou senha incorretos. Tente novamente.");
            return false;
        }
    }
}
