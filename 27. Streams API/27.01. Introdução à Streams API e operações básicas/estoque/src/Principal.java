import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // "Achatar" -> converter vários stream em um único stream
        Stream<Categoria> stream = produtos.stream()
               .filter(Produto::temEstoque)
               .flatMap(produto -> produto.getCategorias().stream());

        stream.forEach(obj -> {
            System.out.println(obj.getClass().getName() + " - " + obj);;
        });

    }

}
