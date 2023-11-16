import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        // Antes do Java 8, era com loop e interativo
        // com Java 8, programacão funcional e API (Streams API)
        // stream uma sequencia de elementos de uma fonte de dados.

        var cadastroProduto = new CadastroProduto();
        //Collections<Produto> -> poderia usar collections no lugar de List
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Forma tradicional
        /*for (Produto produto : produtos) {
            produto.ativar();
            System.out.println(produto);
        }*/

        // Interface Stream, com elementos da lista (não copia a lista)
        // stream não duplica
        Stream<Produto> stream = produtos.stream();
        // Consumer
        stream.forEach(produto -> {
            produto.ativar();
            System.out.println(produto);
        });

    }

}
