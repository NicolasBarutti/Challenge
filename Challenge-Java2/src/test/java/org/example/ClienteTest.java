package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;
import java.util.Date;

class ClienteTest {


    Carro carro = new Carro("Uno",new java.sql.Date(2003),"FIAT", 12334, Cor.Rosa);
    Cliente clienteTeste = new Cliente("Lucas", "masculino", "12312312312",new Date(1234),"Houve um problema", carro, "fiap@email.com", "123456");
    @Test
    void fazer_cadastro() {
        Assertions.assertTrue(clienteTeste.fazerCadastro());
    }

    @Test
    void cancelar_cadastro() {
        Assertions.assertTrue(clienteTeste.cancelarCadastro("fiap@email.com", "123456",true));
    }

    @Test
    void fazer_login() {
        Assertions.assertTrue(clienteTeste.fazerLogin("123456", "fiap@email.com"));
    }
}