package com.algaworks.erp.comercial;

import com.algaworks.erp.estoque.Produto;

import java.util.ArrayList;

// class Pedido
// quando não tem é o default
// ela é visivel apenas para classe do mesmo pacote
// somente a classe cliente consegue acessar
class Pedido {

    ArrayList<Produto> produtos;
    Cliente cliente;

}
