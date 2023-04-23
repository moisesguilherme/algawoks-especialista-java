package com.algaworks.erp.comercial;

import com.algaworks.erp.estoque.Produto;

import java.util.ArrayList;

public class Pedido {

    ArrayList<Produto> produtos;

    // Não precisa importar a classe que está no mesmo pacote
    Cliente cliente;

    // Acessando o construtor default, nele tem a visibilidade public, sem o public não
    // acessa, somente se for no mesmo pacote
    /*Pedido() {
    }*/
}
