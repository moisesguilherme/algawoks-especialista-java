import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.function.IntBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Revisão aula 1 até 14
public class PrincipalReview13 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();


         IntBinaryOperator operacaoSoma = (subtotal, valor) -> {
             System.out.println(subtotal+ "+ " + valor);
             return subtotal + valor;
         };

         //operação de redução, resultado final
         // a partir de sequencia de elementos, soma, média
         int totalEstoque = produtos.stream()
                 .mapToInt(Produto::getQuantidade)
                 //.reduce(0, operacaoSoma);
                 //.reduce(0, (subtotal, valor) -> subtotal + valor);
                 .reduce(0, Integer::sum); // a +b // Method reference

         System.out.println(totalEstoque);


         int maximoEstoque = produtos.stream()
                 .mapToInt(Produto::getQuantidade)
                 .reduce(0, Integer::max);

         System.out.println(maximoEstoque);

     }
}
