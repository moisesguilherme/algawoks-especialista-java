package exemplo2;

import java.util.Comparator;
import java.util.List;

public class Cliente {

    // Um enum como membro estático de uma classe
    // Somente o nome Status e não StatusCliente, não tem necessidade
    // Sempre vai ser static -> public static enum Status
    public enum Status {
        ATIVO, BLOQUEADO

    }

    private final String nome;
    private final int idade;
    private Status status = Status.ATIVO;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void ordernarPorIdade(List<Cliente> clientes) {
        clientes.sort(new IdadeComparator());
    }

    private static class IdadeComparator implements Comparator<Cliente> {

        @Override
        public int compare(Cliente o1, Cliente o2) {
            // acesse sempre os getters, poderia ser o o1.idade direto
            return Integer.compare(o1.getIdade(), o2.getIdade());
        }
    }
}
