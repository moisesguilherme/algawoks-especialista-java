import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Comparator;
import java.util.List;

// Revisão aula 1 até 14
public class PrincipalReview7 {

     public static void main(String[] args) {

         var cadastroProduto = new CadastroProduto();
         List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
                .filter(Produto::temEstoque)
                //.sorted() //ordem natural -> Comparable
                .sorted(Comparator.comparingInt(Produto::getQuantidade))
                .forEach(produto -> System.out.printf("%s = %d unidades%n",
                        produto.getNome(), produto.getQuantidade()));

     }
}
