import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.stream.Stream;

// Revisão aula 1 até 14
public class PrincipalReview {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

         // Forma imperativa (passo a passo)
         /*
         for (Produto produto : produtos) {
             produto.ativar();
             System.out.println(produto);
         }*/

         // Stream não duplica a fonte de dados
         Stream<Produto> stream = produtos.stream();
         //Foreach recebe um consumer, interface funcional
         stream.forEach(produto -> {
             produto.ativar();
             System.out.println(produto);
         });
    }
}
