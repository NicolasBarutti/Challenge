package org.example;

import java.sql.Date;

public class Seguro {
    private String idSeguro;
    private Date dataInicioSeguro;

    public Seguro(String idSeguro, Date dataInicioSeguro) {
        this.idSeguro = idSeguro;
        this.dataInicioSeguro = dataInicioSeguro;
    }

    public String getIdSeguro() {
        return idSeguro;
    }

    public Date getDataInicioSeguro() {
        return dataInicioSeguro;
    }
}
