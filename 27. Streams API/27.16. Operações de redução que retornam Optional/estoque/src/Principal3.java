import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.List;

public class Principal3 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println(produtos);


        long totalProdutosComEstoque = produtos.stream()
                .filter(Produto::temEstoque)
                .count();


        System.out.println(totalProdutosComEstoque);

    }

}
