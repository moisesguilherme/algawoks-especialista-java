import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        //List<Produto> produtos = new ArrayList<>(); // lista vazia


        OptionalInt maiorQuantidadeOptional = produtos.stream()
                .mapToInt(Produto::getQuantidade)
                .reduce(Integer::max);
                //.reduce(0,Integer::max);

        int maiorQuantidade = maiorQuantidadeOptional
                .orElseThrow( () -> new RuntimeException("Quantidade não encontrada"));

        System.out.println(maiorQuantidadeOptional);

    }

}
