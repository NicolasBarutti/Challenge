package org.example;

import java.util.Date;

public abstract class Cliente extends Pessoa implements CadastroPlataforma{

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
}
