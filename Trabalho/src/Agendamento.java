import java.util.Date;

public class Agendamento {

    private Date dataAgendamento;

    private  Date dataFimDeServico;

    private  Mecanicos mecanicos;


    public Agendamento(Date dataAgendamento, Date dataFimDeServico, Mecanicos mecanicos) {
        this.dataAgendamento = dataAgendamento;
        this.dataFimDeServico = dataFimDeServico;
        this.mecanicos = mecanicos;
    }
}
