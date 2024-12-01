import java.util.Date;

public class Projeto extends Conteudo {
    private Date dataEntrega;
    private String feedbackProf;

    public Projeto(String titulo, String descricao, Date dataPublicacao, Date dataEntrega) {
        super(titulo, descricao, dataPublicacao);
        this.dataEntrega = dataEntrega;
    }

    public void enviarProjeto() {
        System.out.println("Projeto '" + getTitulo() + "' enviado com sucesso!");
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getFeedbackProf() {
        return feedbackProf;
    }

    public void setFeedbackProf(String feedbackProf) {
        this.feedbackProf = feedbackProf;
    }

    @Override
    public void visualizarConteudo() {
        super.visualizarConteudo();
        System.out.println("Data de Entrega: " + dataEntrega);
        if (feedbackProf != null) {
            System.out.println("Feedback do Professor: " + feedbackProf);
        }
    }
}