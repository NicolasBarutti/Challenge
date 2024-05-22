package org.example;

import java.util.Date;

public class Mecanico extends Pessoa{
    private String idEmpregado;
    private String especialidade;

    public Mecanico(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento, String idEmpregado, String especialidade) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento);
        this.idEmpregado = idEmpregado;
        this.especialidade = especialidade;
    }

    public String getIdEmpregado() {
        return idEmpregado;
    }

    public String getEspecialidade() {
        return especialidade;
    }

}

