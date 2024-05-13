package estoque;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CadastroProduto {

    private final List<Produto> produtos;

    public CadastroProduto() {

        // Categorias
        Categoria categoriaChurrasco = new Categoria("Churrasco");
        Categoria categoriaCarne = new Categoria ("Carnes");

        // Fabricantes
        Fabricante fabricanteDiPrima = new Fabricante("Di Prima");

        this.produtos = Arrays.asList(
            new Produto("Picanha", new BigDecimal("100"), 0, fabricanteDiPrima, categoriaCarne, categoriaChurrasco)
        );

    }

    public List<Produto> obterTodos() {
        return produtos;
    }
}
