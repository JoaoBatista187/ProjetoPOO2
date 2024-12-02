public class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String email, String senha, String departamento) {
        super(nome, email, senha);
        this.departamento = departamento;
    }

    @Override
    public void login() {
        System.out.println("Professor " + getNome() + " logado");
    }

    @Override
    public void logout() {
        System.out.println("Professor " + getNome() + " deslogado");
    }

    @Override
    public void atualizarPerfil() {
        System.out.println("Perfil do professor " + getNome() + " atualizado");
    }

    public void publicarConteudo() {
        System.out.println("Professor " + getNome() + " publicou conteúdo");
    }

    public void avaliarExercicio() {
        System.out.println("Professor " + getNome() + " avaliou um exercício");
    }

    public void avaliarProjeto() {
        System.out.println("Professor " + getNome() + " avaliou um projeto");
    }

    public void publicarFeedback() {
        System.out.println("Professor " + getNome() + " publicou feedback");
    }
    @Override
    public String toString() {
        return super.toString() + ";" + "Departamento: " + departamento;
    }
}