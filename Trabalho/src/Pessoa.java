import java.util.Date;

public class Pessoa {

    private  String nome;
    private String cpf;
    private  String email;
    private Date dataDeNascimento;

    public Pessoa(String nome, String cpf, String email, Date dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
    }
}
