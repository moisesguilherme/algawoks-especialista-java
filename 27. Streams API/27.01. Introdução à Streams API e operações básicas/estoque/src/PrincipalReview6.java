import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Optional;

// Revisão aula 1 até 14
public class PrincipalReview6 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

         //Qualquer elemento desse stream corresponde
         /*boolean temProdutoNoEstoque = produtos.stream()
                 .peek(System.out::println)
                 .anyMatch(Produto::temEstoque);

         System.out.println(temProdutoNoEstoque);
         */

         //Todos tem estoque
         boolean temProdutoNoEstoque = produtos.stream()
                 .peek(System.out::println)
                 .allMatch(Produto::temEstoque);
         System.out.println(temProdutoNoEstoque);

         // Nenhum produto tem no Estoque
         boolean nenhumProdutoPossuiEstoque = produtos.stream()
                 .peek(System.out::println)
                 .noneMatch(Produto::temEstoque);

         System.out.println(nenhumProdutoPossuiEstoque);


     }
}
