import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Optional;

// Revisão aula 1 até 14
public class PrincipalReview5 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

         for (Produto produto : produtos) {
             if(produto.getNome().equals("Picanha")){
                 System.out.println(">>>");
                 produto.setQuantidade(10);
             }

             System.out.println(produto);
         }

         System.out.println("-----------------------------------");

         Optional<Produto> produtoOptional = produtos.stream()
                 .peek(System.out::println)
                 .filter(Produto::naoTemEstoque)
                 .filter(Produto::isInativo)
                 //.findFirst(); // Operação terminal de curto-circuito, ele vai parar quando achar um elemento
                 .findAny(); // Nao exite uma garania de qual objeto vai ser retornado

         Produto produto = produtoOptional.orElseThrow(
                 () -> new RuntimeException("Produto não encontrado"));

         System.out.println("-----------------------------------");

         System.out.println(produto);
    }
}
