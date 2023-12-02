import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.IntBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        //BigDecimal
        //Stream de produtos para bigdecimal, valor total do estoque

        BigDecimal valorEmEstoque = produtos.stream()
                .map(produto -> produto.getPreco()
                        .multiply(new BigDecimal(produto.getQuantidade())))
                .reduce(BigDecimal.ZERO, BigDecimal::add); // (x,y) -> x.add

        System.out.println(valorEmEstoque);

    }

}
