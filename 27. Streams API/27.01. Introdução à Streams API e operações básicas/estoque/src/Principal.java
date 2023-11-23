import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // ordernar a lista
        //.sorted() -> precisa implementar comparable
        produtos.stream()
                .filter(Produto::temEstoque)
                .forEach(produto -> System.out.printf("%s = %d unidades%n",
                        produto.getNome(), produto.getQuantidade()));

    }

}
