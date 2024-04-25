public class Oficina {
    private String endereco;
    private String cnpj;
    private Mecanicos mecanico;

    public Oficina(String endereco, String cnpj, Mecanicos mecanico) {
        this.endereco = endereco;
        this.cnpj = cnpj;
        this.mecanico = mecanico;
    }
}
