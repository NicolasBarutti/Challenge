package org.example;

import java.sql.Date;

public class Carro {
    private  String modelo;
    private Date anoDoVeiculo;
    private String marca;
    private Long placa;
    private Cor cor;
    private Cliente cliente;

    public Carro(String modelo, Date anoDoVeiculo, String marca, Long placa, Cor cor, Cliente cliente) {
        this.modelo = modelo;
        this.anoDoVeiculo = anoDoVeiculo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
        this.cliente = cliente;
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

    public Long getPlaca() {
        return placa;
    }

    public Cor getCor() {
        return cor;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
