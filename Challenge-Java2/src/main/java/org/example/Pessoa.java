package org.example;

import java.util.Date;

public abstract class Pessoa {
    private  String razaoSocial;
    private String sexoBiologico;
    private String cpf;
    private Date dataDeNascimento;

    public Pessoa(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento) {
        this.razaoSocial = razaoSocial;
        this.sexoBiologico = sexoBiologico;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getSexoBiologico() {
        return sexoBiologico;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }
}
