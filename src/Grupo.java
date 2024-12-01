import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nomeGrupo;
    private List<String> mensagens = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();

    public Grupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public void adicionarAluno(Aluno aluno) {
        if (!alunos.contains(aluno)) {
            alunos.add(aluno);
            System.out.println("Aluno " + aluno.getNome() + " adicionado ao grupo " + nomeGrupo);
        } else {
            System.out.println("Aluno " + aluno.getNome() + " já está no grupo " + nomeGrupo);
        }
    }

    public void removerAluno(Aluno aluno) {
        if (alunos.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNome() + " removido do grupo " + nomeGrupo);
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não encontrado no grupo " + nomeGrupo);
        }
    }

    public void adicionarProfessor(Professor professor) {
        if (!professores.contains(professor)) {
            professores.add(professor);
            System.out.println("Professor " + professor.getNome() + " adicionado ao grupo " + nomeGrupo);
        } else {
            System.out.println("Professor " + professor.getNome() + " já está no grupo " + nomeGrupo);
        }
    }

    public void removerProfessor(Professor professor) {
        if (professores.remove(professor)) {
            System.out.println("Professor " + professor.getNome() + " removido do grupo " + nomeGrupo);
        } else {
            System.out.println("Professor " + professor.getNome() + " não encontrado no grupo " + nomeGrupo);
        }
    }

    public void adicionarMensagem(String mensagem) {
        mensagens.add(mensagem);
        System.out.println("Mensagem adicionada ao grupo " + nomeGrupo + ": " + mensagem);
    }

    public void removerMensagem(String mensagem) {
        if (mensagens.remove(mensagem)) {
            System.out.println("Mensagem removida do grupo " + nomeGrupo + ": " + mensagem);
        } else {
            System.out.println("Mensagem não encontrada no grupo " + nomeGrupo);
        }
    }

    public void listarMensagens() {
        System.out.println("Mensagens do grupo " + nomeGrupo + ":");
        for (String msg : mensagens) {
            System.out.println("- " + msg);
        }
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public List<String> getMensagens() {
        return mensagens;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    @Override
    public String toString() {
        return "Grupo: " + nomeGrupo + "\n" +
                "Alunos: " + alunos.size() + "\n" +
                "Professores: " + professores.size() + "\n" +
                "Mensagens: " + mensagens.size();
    }
}