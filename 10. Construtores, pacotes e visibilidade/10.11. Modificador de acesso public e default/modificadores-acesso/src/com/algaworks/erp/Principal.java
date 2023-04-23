package com.algaworks.erp;


import com.algaworks.erp.estoque.Produto;

public class Principal {
    public static void main(String[] args) {
        //Colocar sempre o nível de acesso mais restrito possível.
        // em classes default, para ter acesso somente no mesmo pacote

        // modificadores de acesso, public e default
        // default, a Classe pedido vc não acessa
        com.algaworks.erp.comercial.Pedido pedido;

        // Não vai conseguir acessar poir o constutor não é público
        // Produto produto = new Produto();

        // A sobrecarda do construtor com "nome" é public, neste caso ela aceita.
        Produto produto = new Produto("Nome produto");
        System.out.println(produto.nome);
    }

}
