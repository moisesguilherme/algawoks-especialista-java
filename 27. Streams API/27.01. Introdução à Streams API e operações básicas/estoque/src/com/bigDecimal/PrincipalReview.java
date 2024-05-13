package com.bigDecimal;

import com.algaworks.estoque.CadastroProduto;
import com.algaworks.estoque.Produto;

import java.math.BigDecimal;
import java.util.List;

public class PrincipalReview {

    public static void main(String[] args) {

        var cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        /*BigDecimal valorEstoque = produtos.stream()
                .map(produto -> produto.getPreco()
                        .multiply(new BigDecimal(produto.getQuantidade()))) //preco * quantidade
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println(valorEstoque);*/

        // Neste exemplo fica mais complexo (burocrático)
        BigDecimal valorEmEstoque = produtos.stream()
                .reduce(BigDecimal.ZERO, (subtotal, produto) -> {
                    BigDecimal valorEstoqueProduto = produto.getPreco()
                            .multiply(new BigDecimal(produto.getQuantidade()));
                    return subtotal.add(valorEstoqueProduto);
                }, BigDecimal::add); //3 argumentos no reduce

        System.out.println(valorEmEstoque);

    }



}
