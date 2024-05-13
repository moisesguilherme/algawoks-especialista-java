import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;

// Revisão aula 1 até 14
public class PrincipalReview10 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

         produtos.stream()
                 .filter(Produto::temEstoque)
                 .map(Produto::getFabricante)
                 .distinct() //statless -- vai percorrer todos os elementos
                 .forEach(System.out::println);

     }
}
