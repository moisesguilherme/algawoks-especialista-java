import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Stream<Produto> stream = produtos.stream();
        // Predicate -> interface funcional
        Stream<Produto> streamComEstoque =
                stream.filter(produto -> produto.getQuantidade() > 0);

    }

}
