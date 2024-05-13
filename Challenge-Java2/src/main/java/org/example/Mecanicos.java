package org.example;

import java.util.Date;

public class Mecanicos extends Pessoa{
    private String idEmpregado;
    private String especialidade;
    private OrdemServico ordemServico;

    public Mecanicos(String razaoSocial,String sexoBiologico, String cpf, Date dataDeNascimento, String idEmpregado, String especialidade, OrdemServico ordemServico) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento);
        this.idEmpregado = idEmpregado;
        this.especialidade = especialidade;
        this.ordemServico = ordemServico;
    }

    public String getIdEmpregado() {
        return idEmpregado;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public OrdemServico getOrdemServico() {
        return ordemServico;
    }

    public void setOrdemServico(OrdemServico ordemServico) {
        this.ordemServico = ordemServico;
    }
}

