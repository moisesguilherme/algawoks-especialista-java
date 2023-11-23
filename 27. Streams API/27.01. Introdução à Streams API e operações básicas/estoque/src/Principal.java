import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        boolean temProdutosComEstoque = produtos.stream()
                .peek(System.out::println)
                .filter(Produto::temEstoque)
                //passa por todos os elementos -> stateful (mantém estado ao ordenar os elementos)
                //.sorted(Comparator.comparingInt(Produto::getQuantidade))
                .anyMatch(Produto::temEstoque); //curto circuito

        System.out.println(temProdutosComEstoque);

    }

}
