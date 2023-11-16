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
                stream.filter(Produto::temEstoque);

        Stream<Produto> streamComEstoqueInativo =
                streamComEstoque.filter(Produto::isInativo);

        //pipeline - conjunto de operacões configuradas em sequencia

        //operacão terminal, executa toda a pipeline, as acões intermediárias não são executadas
        // até chamar a operacão terminal.

        // forEach toda a pipeline é executada
        streamComEstoqueInativo.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });
    }

}
