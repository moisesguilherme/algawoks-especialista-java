import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        IntBinaryOperator operacaoSoma = (subtotal, valor) ->  subtotal + valor;

        int totalEstoque = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(0, operacaoSoma);

        System.out.println(totalEstoque);
    }

}
