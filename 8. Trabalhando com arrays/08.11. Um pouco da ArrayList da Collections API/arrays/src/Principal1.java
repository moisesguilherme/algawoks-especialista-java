import java.util.ArrayList;

public class Principal1 {

    public static void main(String[] args) {
        String[] alunos = new String[2];
        alunos[0] = "João";
        alunos[1] = "Maria";


        for (int i = 0; i < alunos.length; i++) {
            String aluno = alunos[i];
            System.out.println(aluno);
        }

//        for (String aluno : alunos) {
//            System.out.println(aluno);
//        }
    }

}
