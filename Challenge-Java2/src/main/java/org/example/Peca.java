package org.example;

public class Peca {
    private  String codigoEstoquePeca;
    private boolean reposicao; //Deve ou não ser reposta no estoque

    public Peca(String codigoEstoquePeca, boolean reposicao) {
        this.codigoEstoquePeca = codigoEstoquePeca;
        this.reposicao = reposicao;
    }

    public String getCodigoEstoquePeca() {
        return codigoEstoquePeca;
    }

    public boolean isReposicao() {
        return reposicao;
    }
}
