import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Comparator;
import java.util.List;

public class PrincipalMinMax {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println(produtos);

        /*
        int menorQuantidadeEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .mapToInt(Produto::getQuantidade) //mapToInt (Evita o boxing e unboxing)
                //.min()
                .max()
                .orElseThrow(() -> new RuntimeException("Menor quantidade não encontrada"));

        ystem.out.println(menorQuantidadeEstoque);
        */

        Produto produtoMaisBarato = produtos.stream() // retorna um stream de produto
                .filter(Produto::temEstoque)
                .min(Comparator.comparing(Produto::getPreco)) //precisa informar a função de comparação
                .orElseThrow(() -> new RuntimeException("Produto mais barato não encontrado"));

        System.out.println(produtoMaisBarato);

    }

}
