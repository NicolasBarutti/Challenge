package org.example;

import java.util.Date;

public class Cliente extends Pessoa implements CadastroPlataforma{

    private String descricaoProblema;
    private Carro carro;
    private String emailPlataforma;
    private String senhaPlataforma;

    public Cliente(String razaoSocial, String sexoBiologico, String cpf, Date dataDeNascimento, String descricaoProblema, Carro carro, String emailPlataforma, String senhaPlataforma) {
        super(razaoSocial, sexoBiologico, cpf, dataDeNascimento);
        this.descricaoProblema = descricaoProblema;
        this.carro = carro;
        this.emailPlataforma = emailPlataforma;
        this.senhaPlataforma = senhaPlataforma;
    }


    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public Carro getCarro() {
        return carro;
    }

    public String getEmailPlataforma() {
        return emailPlataforma;
    }

    public String getSenhaPlataforma() {
        return senhaPlataforma;
    }


    private boolean isEmailValido(String email) {
        return email != null && email.contains("@");
    }

    private boolean isSenhaValida(String senha) {
        return senha != null && senha.length() >= 6;
    }

    @Override
    public boolean fazerCadastro() {
        if (!isEmailValido(emailPlataforma)) {
            return false;
        }
        else if (!isSenhaValida(senhaPlataforma)) {
            return false;
        }
        return true;

    }

    @Override
    public boolean cancelarCadastro(String email, String senha, boolean verificarCerteza) {
            if (getEmailPlataforma().equals(email) && (getSenhaPlataforma().equals(senha))){
                return true;
            }
            return false;
    }

    @Override
    public boolean fazerLogin(String senha, String email) {
        if (getEmailPlataforma().equals(email) && (getSenhaPlataforma().equals(senha))){
            return true;
        }
        return false;


    }
}
