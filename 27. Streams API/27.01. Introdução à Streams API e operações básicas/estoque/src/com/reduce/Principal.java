package com.reduce;

import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Categoria;
import com.algaworks.estoque.Produto;

import java.util.List;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
        Categoria categoriaChurrasco = new Categoria("Churrasco");
        Categoria categoriaBebidas = new Categoria("Bebidas");

        Predicate<Produto> categoriaChurrascoOuBebida = p -> p.getCategorias().contains(categoriaChurrasco)
                || p.getCategorias().contains(categoriaBebidas);


        int somaEstoque = produtos.stream()
                .filter(categoriaChurrascoOuBebida)
                .mapToInt(Produto::getQuantidade)
                .reduce(0, Integer::sum);

        produtos.forEach(produto -> {
            System.out.println("Categoria:" + produto.getCategorias());
            System.out.println(produto);
        });


        System.out.println(somaEstoque);

    }


}
