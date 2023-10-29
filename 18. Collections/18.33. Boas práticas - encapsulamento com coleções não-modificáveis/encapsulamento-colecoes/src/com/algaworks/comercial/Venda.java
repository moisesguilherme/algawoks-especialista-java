package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    private List<ItemVenda> itens = new ArrayList<>();
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }
}
