import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Arquivo {
    public static void salvarAlunos(List<Aluno> alunos, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Aluno aluno : alunos) {
                writer.write(aluno.toString());
                writer.newLine();
            }
            System.out.println("Alunos salvos com sucesso em: " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar alunos no arquivo: " + caminhoArquivo);
            e.printStackTrace();
        }
    }
    public static void salvarProfessores(List<Professor> professores, String caminhoArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Professor professor : professores) {
                writer.write(professor.toString());
                writer.newLine();
            }
            System.out.println("Professores salvos com sucesso em: " + caminhoArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao salvar professores no arquivo: " + caminhoArquivo);
            e.printStackTrace();
        }
    }
    public static void exibirArquivo(String caminhoArquivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

