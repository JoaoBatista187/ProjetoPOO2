public class Aluno extends Usuario {
    private String turma;

    public Aluno(String nome, String email, String senha, String turma) {
        super(nome, email, senha);
        this.turma = turma;
    }

    @Override
    public void login() {
        System.out.println("Aluno " + getNome() + " logado");
    }

    @Override
    public void logout() {
        System.out.println("Aluno " + getNome() + " deslogado");
    }

    @Override
    public void atualizarPerfil() {
        System.out.println("Perfil do aluno " + getNome() + " atualizado");
    }

    public void estudar() {
        System.out.println("Aluno " + getNome() + " está estudando");
    }

    public void enviarProjeto() {
        System.out.println("Aluno " + getNome() + " enviou um projeto");
    }
}