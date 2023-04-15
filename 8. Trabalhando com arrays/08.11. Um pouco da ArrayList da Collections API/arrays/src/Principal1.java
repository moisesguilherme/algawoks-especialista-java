import java.util.ArrayList;

public class Principal1 {

    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("João");
        alunos.add("Maria");

        for (int i = 0; i < alunos.size(); i++) {
            String aluno = alunos.get(i);
            System.out.println(aluno);
        }

        // enhenced for
        // alunos for
        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        // ArrayList não suporta tipos primitivos
        // ArrayList<int> numeros = new ArrayList<>();
        // Pode usar o tipo wrapper exemplo: Integer
        // ArrayList<Integer> numeros = new ArrayList<>();
    }

}
