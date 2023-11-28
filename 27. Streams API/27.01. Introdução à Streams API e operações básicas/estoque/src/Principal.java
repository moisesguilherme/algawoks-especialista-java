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

        /*
        for (Produto produto : produtos) {
            if(produto.temEstoque()) {
                Fabricante fabricante = produto.getFabricante();
                System.out.println(fabricante);
            }
        }*/

        Stream<Fabricante> stream = produtos.stream()
                .filter(Produto::temEstoque)
                //.map(produto -> produto.getFabricante());
                .map(Produto::getFabricante); //faz a transformacão o mapeamento

        stream.forEach(System.out::println);

    }

}
