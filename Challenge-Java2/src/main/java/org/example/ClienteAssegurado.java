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
    public void fazerLogin() {

    }
}
