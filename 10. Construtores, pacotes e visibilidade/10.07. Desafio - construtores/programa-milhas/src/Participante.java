import java.util.Objects;

public class Participante {

    static final int SALDO_DE_PONTOS_INICIAL = 0;

    String nome;
    int saldoDePontos;

    public Participante(String nome) {
        this(nome, SALDO_DE_PONTOS_INICIAL);

    }

    public Participante(String nome, int saldoDePontos) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if(saldoDePontos < 0){
            throw new IllegalArgumentException("O saldo de pontos não pode ser negativo");
        }

        this.nome = nome;
        this.saldoDePontos = saldoDePontos;
    }
}
