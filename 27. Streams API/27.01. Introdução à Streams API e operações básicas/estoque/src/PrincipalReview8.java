import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Comparator;
import java.util.List;

// Revisão aula 1 até 14
public class PrincipalReview8 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

        boolean temProdutoComEstoque = produtos.stream()
                .peek(System.out::println)
                .filter(Produto::temEstoque)
                //sorted sempre vai processar todos os elementos
                .sorted(Comparator.comparingInt(Produto::getQuantidade)) //peek passa port todos elementos
                .anyMatch(Produto::temEstoque); //não passa por todos os elementos.

         System.out.println(temProdutoComEstoque);

     }
}
