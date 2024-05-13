import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PrincipalCollect8_Map {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        /*Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
                .collect(Collectors.groupingBy(produto -> produto.getFabricante());
        */

        //partitioningBy - particionar em dois grupos, um verdadeiro e falso
        Map<Boolean, List<Produto>> produtosPorFabricante = produtos.stream()
                .collect(Collectors.partitioningBy(Produto::temEstoque));

        produtosPorFabricante.forEach((chave, valor) -> {
            System.out.println();
            System.out.println(chave);
            System.out.println("---------");
            valor.forEach(System.out::println);
        });

    }
}
