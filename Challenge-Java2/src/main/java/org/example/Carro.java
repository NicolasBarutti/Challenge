package org.example;

import java.sql.Date;

public class Carro {
    private  String modelo;
    private Date anoDoVeiculo;
    private String marca;
    private Integer placa;
    private Cor cor;

    public Carro(String modelo, Date anoDoVeiculo, String marca, Integer placa, Cor cor) {
        this.modelo = modelo;
        this.anoDoVeiculo = anoDoVeiculo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public Date getAnoDoVeiculo() {
        return anoDoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public Integer getPlaca() {
        return placa;
    }

    public Cor getCor() {
        return cor;
    }
}
