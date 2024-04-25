import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.OptionalInt;

public class Principal2 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println(produtos);

        /*
        int totalEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade) //precisa do mapToInt
                .sum(); //Operação terminal, pode substituir o reduce
                //max()

        System.out.println(totalEstoque);
         */

        /*BigDecimal totalPreco = produtos.stream()
                .map(produto -> {
                    System.out.println(produto.getPreco());
                    return produto.getPreco();
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(totalPreco);
        */

    }

}
