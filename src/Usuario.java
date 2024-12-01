public abstract class Usuario {
    private String nome;
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract void login();

    public abstract void logout();

    public abstract void atualizarPerfil();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}