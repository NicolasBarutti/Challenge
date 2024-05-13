package org.example;

public class Oficina {
    private String nomeOficina;
    private String endereco;
    private String cnpj;
    private Mecanicos mecanicos;
    private boolean homologadaPorto;

    public Oficina(String endereco, String cnpj, Mecanicos mecanicos) {
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.mecanicos = mecanicos;
    }

    public String getNomeOficina() {
        return nomeOficina;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Mecanicos getMecanicos() {
        return mecanicos;
    }

    public boolean isHomologadaPorto() {
        return homologadaPorto;
    }

    public void setHomologadaPorto(boolean homologadaPorto) {
        this.homologadaPorto = homologadaPorto;
    }

    public void setMecanicos(Mecanicos mecanicos) {
        this.mecanicos = mecanicos;
    }
}
