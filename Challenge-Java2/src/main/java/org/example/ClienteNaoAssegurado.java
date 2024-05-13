package org.example;

import java.util.Date;

public class ClienteNaoAssegurado extends Cliente{

    public ClienteNaoAssegurado(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento, String descricaoProblema, Carro carro, String emailPlataforma, String senhaPlataforma) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento, descricaoProblema, carro, emailPlataforma, senhaPlataforma);
    }

    @Override
    public void fazerCadastro() {
        //nao precisa do idSeguro
    }

    @Override
    public void cancelarCadastro() {

    }

    @Override
    public void fazerLogin() {

    }
}
