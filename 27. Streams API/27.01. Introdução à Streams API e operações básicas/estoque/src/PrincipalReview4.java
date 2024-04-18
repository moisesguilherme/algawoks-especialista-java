import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;

// Revisão aula 1 até 14
public class PrincipalReview4 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();


         for (Produto produto : produtos) {
             System.out.println(produto);
         }

         System.out.println("-----------------------------------");

         // Stream.peek (ação intermediária)
         // O uso do peek é mais para debug
         //.forEach(produto -> produto.setNome(produto.getNome().toUpperCase())) // operação terminal
         produtos.stream()
                 .peek(produto -> produto.setNome(produto.getNome().toUpperCase()))
                 .peek(p -> System.out.println("Antes do temEstoque: " + p))
                 .filter(Produto::temEstoque)
                 .peek(p -> System.out.println("Depois do temEstoque: " + p))
                 .filter(Produto::isInativo)
                 .forEach(produto -> {
                     System.out.println("Ativando" + produto);
                     produto.ativar();
                 });


         /*
         for (Produto produto : produtos) {
             System.out.println(produto.getNome());
         }*/
    }
}
