import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCollect {

    public static void main(String[] args) {

        List<Aluno> list = new ArrayList<>();

        list.add(new Aluno("Maria", 10));
        list.add(new Aluno("João", 9));
        list.add(new Aluno("Marcos", 5));

        System.out.println(list);


        List<Aluno> listaAlterada = list.stream()
                .map( x -> {
                      Aluno a = new Aluno(x.nome, x.nota);
                      a.aprovado = x.nota > 5 ? true : false;
                      return a;
                }).collect(Collectors.toList());


        System.out.println(listaAlterada);

        /*for (Aluno aluno : listaAlterada) {
            System.out.println("Aluno: " + aluno.nome);
        }*/

    }
}

class Aluno {
    public String nome;
    public boolean aprovado;
    public float nota;

    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.aprovado = false;
        this.nota = nota;
    }

    public String exibeReultado() {
        return aprovado == true ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno: " +
                nome + ", Resultado: " + exibeReultado();
    }
}
