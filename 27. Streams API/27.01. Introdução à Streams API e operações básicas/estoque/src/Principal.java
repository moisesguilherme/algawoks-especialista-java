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

        Stream<Set<Categoria>> stream = produtos.stream()
               .filter(Produto::temEstoque)
               .map(Produto::getCategorias); // retorna um set - Set<Categoria>

        //stream.forEach(System.out::println);
        //stream.forEach(obj -> System.out.println(obj.getClass().getName() + " - " + obj.toString()));

        // percorrer
        // não fica muito bom! Código ruim.
        stream.forEach(obj -> {
            obj.stream().forEach(System.out::println);
        });

    }

}
