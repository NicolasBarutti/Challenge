import java.util.Date;

public class Carro {

    private  String modelo;

    private Date anoDoVeiculo;

    private String marca;

    private Long placa;

    private Cor cor;

    public Carro(String modelo, Date anoDoVeiculo, String marca, Long placa, Cor cor) {
        this.modelo = modelo;
        this.anoDoVeiculo = anoDoVeiculo;
        this.marca = marca;
        this.placa = placa;
        this.cor = cor;
    }
}
