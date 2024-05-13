package estoque;


import java.util.Objects;

// Com record o Java automaticamente gera métodos como
// toString(), equals(), hashCode() e o constructor.
public record Categoria(String nome) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nome, categoria.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}


