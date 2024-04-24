import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        //List<Produto> produtos = cadastroProduto.obterTodos();
        List<Produto> produtos = new ArrayList<>(); // lista vazia

        int totalEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0,Integer::max);

        System.out.println(totalEstoque);
    }

}
