import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Revisão aula 1 até 14
public class PrincipalReview12 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();



         //Stream<int> -> não exite -> boxing
         Stream<Integer> stream = produtos.stream()
                 .filter(Produto::temEstoque)
                 .map(Produto::getQuantidade); // faz o boxing transforma int em Integer

                                        // aqui é feito o unboxing (degrada performance com um volume alto)
        //stream.forEach((Integer num) -> System.out.println(num * 2));

        //IntStream
         IntStream streamInt = produtos.stream()
                 .filter(Produto::temEstoque)
                 .mapToInt(Produto::getQuantidade)
                 .sorted();

         //streamInt.forEach((int num) -> System.out.println(num * 2));
         streamInt.forEach(num -> System.out.println(num * 2)); // forma nativa
         // forEach aceita um IntConsumer
     }
}
