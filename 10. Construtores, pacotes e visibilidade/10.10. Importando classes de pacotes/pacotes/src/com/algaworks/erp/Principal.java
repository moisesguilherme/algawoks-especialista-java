package com.algaworks.erp;

import com.algaworks.erp.comercial.Pedido;
import com.algaworks.erp.estoque.Produto;

public class Principal {
    public static void main(String[] args) {
        // nome totalmente qualificado fully qualify name
        //com.algaworks.erp.comercial.Pedido pedido = new com.algaworks.erp.comercial.Pedido();

        // com import no cabecalho.
        // não pode acessar fora do pacote
        Pedido pedido = new Pedido();

        Produto produto = new Produto();

        System.out.println(produto.nome);
        //System.out.println(produto.codigo);

        // O System Vem do pacote java.lang (Não precisa ser importado)
        // java.lang.System
        System.out.println(produto.quantidadeEstoque);
        java.lang.String nome = "String está em java.lang";

    }
}
