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

        // Faz o boxing -> transforma o int em Integer
        Stream<Integer> stream = produtos.stream()
               .filter(Produto::temEstoque)
               .map(Produto::getQuantidade);

        // (num * 2) -> faz o unboxing
        stream.forEach((Integer num) -> System.out.println(num * 2));

    }

}
