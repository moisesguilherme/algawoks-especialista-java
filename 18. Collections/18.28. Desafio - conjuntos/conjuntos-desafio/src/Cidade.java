import java.util.Comparator;
import java.util.Objects;

public class Cidade implements Comparable<Cidade> {
    // propriedade chave, ordem natural
    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }


    @Override
    public boolean equals(Object o) {
        System.out.printf(">>> equals: %s %s%n", codigoIbge, ((Cidade) o).getCodigoIbge());
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cidade cidade = (Cidade) o;
        return codigoIbge == cidade.codigoIbge;
    }

    @Override
    public int hashCode() {
        System.out.println(">>> hashCode:" + codigoIbge);
        return Objects.hash(codigoIbge);
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "codigoIbge=" + codigoIbge +
                ", nome='" + nome + '\'' +
                ", totalHabitantes=" + totalHabitantes +
                '}';
    }

    @Override
    public int compareTo(Cidade o) {
        System.out.printf(">>> compareTo %s = %s%n", getCodigoIbge(), o.getCodigoIbge());
        /*if(getCodigoIbge() < o.getCodigoIbge())
            return -1;
        else if (getCodigoIbge() > o.getCodigoIbge()) {
            return 1;
        }else
            return 0;
         */
        return Integer.compare(getCodigoIbge(), o.getCodigoIbge());
    }
}
