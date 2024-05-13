import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrincipalCollect5_Map {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Mapa -> Map (o mapa tem chave e valor)
        Map<String, Integer> estoque = produtos.stream()
                .filter(Produto::temEstoque)
                .collect(Collectors.toMap(Produto::getNome, // Method Reference
                        Produto::getQuantidade));

                //.collect(Collectors.toMap(produto -> produto.getNome(),
                //        produto -> produto.getQuantidade())); //KeyMapper e valor

        System.out.println(estoque);

    }
}
