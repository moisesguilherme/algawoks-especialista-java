import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

// Revisão aula 1 até 14
public class PrincipalReview3 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

         //Stream tem 3 partes
         // 1 - fonte de dados, lista de produtos
         // 2 - operações intermediárias, uma ou várias, exemplo filter
         // 3 - operação terminal, pode ter uma ou nenhuma, se não tiver a operação intermediaária não vai executar

         produtos.stream()
                 .filter(Produto::temEstoque)
                 .filter(Produto::isInativo)
                 .forEach(produto -> {
                     System.out.println("Ativando" + produto);
                     produto.ativar();
                 });

         /*Stream<Produto> stream = produtos.stream();
         Stream<Produto> streamComEstoque = stream
                 //.filter(produto -> produto.getQuantidade() > 0);
                 //.filter(produto -> produto.temEstoque());
                  .filter(Produto::temEstoque); // Method reference

         Stream<Produto> streamComEstoqueInativo = streamComEstoque
                 .filter(Produto::isInativo);
         //filter -> operação intermediária, tardia, lazy, preguiçosa, só vai executar
         //quando uma operação terminal for executada.

         // Não vai percorrer a lista 2 vezes, uma para cada filter

         streamComEstoqueInativo.forEach(produto -> {
             produto.ativar();
             System.out.println(produto);
         });


         // forEach é um tipo de operação terminal
         //streamComEstoqueInativo.forEach(System.out::println);

          */
    }
}
