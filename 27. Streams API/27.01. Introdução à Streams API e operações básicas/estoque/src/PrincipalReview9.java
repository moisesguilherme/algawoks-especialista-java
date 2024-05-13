import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

// Revisão aula 1 até 14
public class PrincipalReview9 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();


         /*for (Produto produto : produtos) {
             if(produto.temEstoque()) {
                 Fabricante fabricante = produto.getFabricante();
                 System.out.println(fabricante);
             }
         }*/

         //retorna um stream de fabricantes
         /*(Stream<Fabricante> stream = produtos.stream()
                 .filter(Produto::temEstoque)
                 //.map(produto -> produto.getFabricante());
                 .map(Produto::getFabricante);
         stream.forEach(System.out::println);
         */

         produtos.stream()
                 .filter(Produto::temEstoque)
                 .map(Produto::getFabricante)
                 .forEach(System.out::println);

     }
}
