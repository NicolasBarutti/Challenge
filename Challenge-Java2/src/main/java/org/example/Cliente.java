package org.example;

import java.util.Date;

public class Cliente extends Pessoa implements CadastroPlataforma{

    private String descricaoProblema;
    private Carro carro;
    private String emailPlataforma;
    private String senhaPlataforma;

    public Cliente(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento, String descricaoProblema, Carro carro, String emailPlataforma, String senhaPlataforma) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento);
        this.descricaoProblema = descricaoProblema;
        this.carro = carro;
        this.emailPlataforma = emailPlataforma;
        this.senhaPlataforma = senhaPlataforma;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public Carro getCarro() {
        return carro;
    }

    public String getEmailPlataforma() {
        return emailPlataforma;
    }

    public String getSenhaPlataforma() {
        return senhaPlataforma;
    }

    @Override
    public void fazerCadastro() {

    }

    @Override
    public void cancelarCadastro() {

    }

    @Override
    public void fazerLogin() {

    }
}
