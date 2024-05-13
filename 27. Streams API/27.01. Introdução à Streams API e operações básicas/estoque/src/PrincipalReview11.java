import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

// Revisão aula 1 até 14
public class PrincipalReview11 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

         /*Stream<Set<Categoria>> stream = produtos.stream()
                 .filter(Produto::temEstoque)
                 .map(Produto::getCategorias); // retorna <Set<Categoria>

         stream.forEach(obj -> System.out.println(obj.getClass().getName() + " - " + obj));

         stream.forEach(obj -> {
             obj.stream().forEach(System.out::println);
          */

         // outra forma
         // Stream de Stream -> muito ruim de ler
         /*
         Stream<Stream<Categoria>> stream = produtos.stream()
                 .filter(Produto::temEstoque)
                 .map(produto -> produto.getCategorias().stream()); // retorna <Set<Categoria>

         stream.forEach(obj -> {
             obj.forEach(System.out::println);
         });
        */

         // uso do flatMap (quando tem stream de stream)
         Stream<Categoria> stream = produtos.stream()
                 .filter(Produto::temEstoque)
                 .flatMap(produto -> produto.getCategorias().stream()) // retorna <Set<Categoria>
                 .distinct();

         /*stream.forEach(obj -> {
            System.out.println(obj.getClass().getName() +  " - " + obj);
        });
        */

         produtos.stream()
                 .filter(Produto::temEstoque)
                 .flatMap(produto -> produto.getCategorias().stream()) // atacha o Stream<Stream<Categoria>>
                 .distinct()
                 .forEach(System.out::println);
     }
}
