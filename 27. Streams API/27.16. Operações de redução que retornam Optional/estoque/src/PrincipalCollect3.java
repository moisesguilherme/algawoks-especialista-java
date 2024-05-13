import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;

public class PrincipalCollect3 {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();


        //.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
                  //suplier,       acumulator,     combiner

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream())
                .distinct()
                //.collect(Collectors.toList()); //Coletor padrão, não tem garantia o tipo da lista
                //.collect(toList()); //Adicionar -> Static import na ide (alt+ enter)
                //.collect(Collectors.toCollection(ArrayList::new)); // tem a garantia que é um ArrayList
                .collect(toCollection(ArrayList::new)); // tem a garantia que é um ArrayList

        System.out.println(categorias);
    }
}
