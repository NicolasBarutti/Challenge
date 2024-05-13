package org.example;

import java.util.Date;

public class OrdemServico {
    private  boolean statusTermino;
    private Peca peca;
    private Oficina oficina;
    private Date dataManutencao;
    private Mecanicos mecanicos;

    public OrdemServico(boolean statusTermino, Peca peca, Oficina oficina, Date dataManutencao, Mecanicos mecanicos) {
        this.statusTermino = statusTermino;
        this.peca = peca;
        this.oficina = oficina;
        this.dataManutencao = dataManutencao;
        this.mecanicos = mecanicos;
    }

    public void setStatusTermino(boolean statusTermino) {
        this.statusTermino = statusTermino;
    }

    public boolean isStatusTermino() {
        return statusTermino;
    }

    public Peca getPeca() {
        return peca;
    }

    public Oficina getOficina() {
        return oficina;
    }
    public Date getDataManutencao() {
        return dataManutencao;
    }

    public Mecanicos getMecanicos() {
        return mecanicos;
    }
}
