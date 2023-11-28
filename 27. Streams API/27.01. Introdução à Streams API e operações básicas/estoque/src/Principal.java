import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Fabricante;
import com.algaworks.estoque.Produto;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        // problema, elementos duplicados - Coca-cola
        produtos.stream()
                .filter(Produto::temEstoque)
                .map(Produto::getFabricante) // retorna fabricante
                .distinct() // operacão state obs.. pode percorrer todos os elementos - chama o hashcode
                .forEach(System.out::println);

    }

}
