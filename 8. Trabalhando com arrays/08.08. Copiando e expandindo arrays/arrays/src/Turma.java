import java.util.Arrays;

public class Turma {

    String identificacao;
    String nomeProfessora;
    Aluno[] alunos = new Aluno[0];

    void imprimirListaDeAlunos() {
        for (Aluno aluno : alunos) {
            if (aluno != null) {
                System.out.printf("%s (%d anos)%n", aluno.nome, aluno.idade);
            } else {
                System.out.println("vago");
            }
        }
    }

}
