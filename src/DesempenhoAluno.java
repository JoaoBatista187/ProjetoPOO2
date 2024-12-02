import java.util.HashMap;
import java.util.Map;

public class DesempenhoAluno {
    private int matriculaAluno;
    private Map<String, Double> progressoConteudos;
    private Map<String, Double> notasConteudos;

    public DesempenhoAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
        this.progressoConteudos = new HashMap<>();
        this.notasConteudos = new HashMap<>();
    }



    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public void atualizarProgresso(String conteudo, double progresso) {
        if (progresso < 0 || progresso > 100) {
            throw new IllegalArgumentException("Progresso deve estar entre 0 e 100.");
        }
        progressoConteudos.put(conteudo, progresso);
    }

    public double getProgresso(String conteudo) {
        return progressoConteudos.getOrDefault(conteudo, 0.0);
    }

    public void registrarNota(String conteudo, double nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Nota deve estar entre 0 e 10.");
        }
        notasConteudos.put(conteudo, nota);
    }

    public double getNota(String conteudo) {
        return notasConteudos.getOrDefault(conteudo, -1.0); // Retorna -1 se não houver nota
    }

    public String gerarResumoDesempenho() {
        StringBuilder resumo = new StringBuilder();
        resumo.append("Matrícula: ").append(matriculaAluno).append("\n");
        resumo.append("Desempenho nos Conteúdos:\n");

        for (String conteudo : progressoConteudos.keySet()) {
            double progresso = progressoConteudos.get(conteudo);
            double nota = notasConteudos.getOrDefault(conteudo, -1.0);
            resumo.append("- ").append(conteudo)
                    .append(": Progresso = ").append(progresso).append("%");
            if (nota >= 0) {
                resumo.append(", Nota = ").append(nota);
            } else {
                resumo.append(", Nota = Não registrada");
            }
            resumo.append("\n");
        }
        return resumo.toString();
    }

    public Desempenho avaliarDesempenho() {
        double somaNotas = 0.0;
        int totalConteudos = notasConteudos.size();

        if (totalConteudos == 0) {
            return Desempenho.MEDIO;
        }

        for (double nota : notasConteudos.values()) {
            somaNotas += nota;
        }

        double mediaNotas = somaNotas / totalConteudos;

        if (mediaNotas >= 9) {
            return Desempenho.EXCELENTE;
        } else if (mediaNotas >= 7) {
            return Desempenho.OTIMO;
        } else if (mediaNotas >= 5) {
            return Desempenho.BOM;
        } else if (mediaNotas >= 3) {
            return Desempenho.MEDIO;
        } else {
            return Desempenho.RUIM;
        }
    }
}
