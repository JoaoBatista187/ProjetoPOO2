import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Sistema Educacional");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("Arquivo");
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);

        LoginPanel loginPanel = new LoginPanel();
        frame.add(loginPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    };
}


class LoginPanel extends JPanel {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginPanel() {
        setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Matrícula:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Senha:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
            }
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel());
        add(loginButton);

        Aluno aluno1 = new Aluno("João Silva", "joao@gmail.com", "senha123", "Turma A");
        Aluno aluno2 = new Aluno("Maria Oliveira", "maria@gmail.com", "senha456", "Turma B");

        Professor professor1 = new Professor("Ana Costa", "ana@gmail.com", "senha789", "Matemática");
        Professor professor2 = new Professor("Carlos Pereira", "carlos@gmail.com", "senha321", "História");

        aluno1.login();
        aluno2.login();

        aluno1.estudar();
        aluno1.enviarProjeto();
        aluno2.estudar();
        aluno2.enviarProjeto();

        aluno1.atualizarPerfil();
        aluno2.atualizarPerfil();

        professor1.login();
        professor2.login();

        professor1.publicarConteudo();
        professor1.avaliarExercicio();
        professor2.publicarConteudo();
        professor2.avaliarExercicio();

        Conteudo conteudoMatematica = new Conteudo("Introdução à Matemática", "Conceitos básicos de Matemática.", new Date());
        Projeto projetoHistoria = new Projeto("Projeto de História", "Pesquisa sobre a Revolução Francesa.", new Date(), new Date());

        conteudoMatematica.visualizarConteudo();
        projetoHistoria.visualizarConteudo();

        projetoHistoria.enviarProjeto();

        DesempenhoAluno desempenhoAluno1 = new DesempenhoAluno(12345);
        desempenhoAluno1.registrarNota("Matemática", 8.0);
        desempenhoAluno1.registrarNota("História", 9.5);
        desempenhoAluno1.atualizarProgresso("Matemática", 75.0);
        desempenhoAluno1.atualizarProgresso("História", 80.0);

        System.out.println(desempenhoAluno1.gerarResumoDesempenho());

        Desempenho desempenho1 = desempenhoAluno1.avaliarDesempenho();
        System.out.println("Desempenho do aluno 1: " + desempenho1);

        Grupo grupoEstudo = new Grupo("Grupo de Estudo de História");
        grupoEstudo.adicionarAluno(aluno1);
        grupoEstudo.adicionarAluno(aluno2);
        grupoEstudo.adicionarProfessor(professor1);
        grupoEstudo.adicionarProfessor(professor2);

        grupoEstudo.adicionarMensagem("Reunião do grupo na sexta-feira às 18h.");
        grupoEstudo.adicionarMensagem("Lembrete: prazo do projeto de História é na próxima semana.");

        grupoEstudo.listarMensagens();

        aluno1.logout();
        aluno2.logout();
        professor1.logout();
        professor2.logout();

    }
}
