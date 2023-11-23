import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Predicate -> interface funcional
        // anyMatch(Predicate<>) pode passar uma lambda expression
        boolean temProdutoNoEstoque = produtos.stream()
                .peek(System.out::println)
                .anyMatch(Produto::temEstoque);

        System.out.println(temProdutoNoEstoque);

    }

}
