import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // Fluxo de tipos primitivo int
        IntStream stream = produtos.stream()
               .filter(Produto::temEstoque)
               .mapToInt(Produto::getQuantidade) //ToIntFunction recebe um tipo e retorna um int
               .sorted();

        // (num * 2) -> não vai fazer o unboxing
        stream.forEach(num -> System.out.println(num * 2));

    }

}
