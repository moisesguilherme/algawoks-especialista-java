import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    // Precia inicializar ou no contrutor ou na variável
    // final String codigo = "ABC-123"
    final String codigo;
    String nome;
    int quantidadeEstoque;

    Produto() {
        this("Sem nome");
        // não compila pois ele chama outro construtor que pode inicializar a variavel.
        //this.codigo = "123";
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        // Aqui sim vai inicializar a variável
        // usando UUID - universally unique identifier
        this.codigo = UUID.randomUUID().toString();

    }
}