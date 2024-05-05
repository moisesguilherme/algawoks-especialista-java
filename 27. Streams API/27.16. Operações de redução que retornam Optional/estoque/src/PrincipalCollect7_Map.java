import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrincipalCollect7_Map {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println(produtos);

        /*
        Map<String, Long>  produtosPorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(), //chave -> gera a chave
                        Collectors.counting())); // valor
        */

        Map<String, Integer>  estoquePorFabricante = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.groupingBy(produto -> produto.getFabricante().nome(), //chave -> gera a chave
                        Collectors.summingInt(Produto::getQuantidade))); // valor

        System.out.println(estoquePorFabricante);
    }
}
