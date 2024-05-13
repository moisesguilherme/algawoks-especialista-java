import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrincipalCollect {

    public static void main(String[] args) {
        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*
        produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream()) // atachar o stream de categorias
                .distinct()
                .forEach(System.out::println);
        */
        //Virar uma lista de categoria

        List<Categoria> categorias = produtos.stream()
                .filter(Produto::temEstoque)
                .flatMap(produto -> produto.getCategorias().stream()) // achatar o stream de categorias
                .distinct()
                .collect(() -> new ArrayList<>(), // collect tb faz a redução, como o reduce, primeiro argumento instancia o primeiro
                        (lista, elemento) -> lista.add(elemento), //acumuladaor BiConsumer
                        (lista1, lista2) -> lista1.addAll(lista2)); //combiner (junta as duas listas em uma única lista), joga a segunda na primeira (lista2 na lista1)

                //.collect(ArrayList::new, ArrayList::add, ArrayList::addAll); //Reduz com method reference


        /*
         Object collect(Supplier<Object>, // Supplier <T> e retorna um objeto.
         BiConsumer<Object, ? super Categoria>,
         BiConsumer<Object, Object>)
         */

        System.out.println(categorias);
    }
}
