package com.algaworks.comercial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venda {

    private final Cliente cliente;
    // final não permitir ser alterada
    private final List<ItemVenda> itens = new ArrayList<>();
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
   /*
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }*/
    // Não ter o setItens
    /*
    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }*/

    public List<ItemVenda> getItens() {
        // uma solucão é retornar um novo arraylist
        return new ArrayList<>(itens);
    }

    public void adicionarItem(ItemVenda item) {
        if (excedLimiteDeCompra(item)) {
            throw new LimiteDeCompraExcedidoException(
              String.format("Limite atal: %.2f", cliente.getLimiteCompras()));
        }

        valorTotal += item.getValor();
        itens.add(item);
    }

    private boolean excedLimiteDeCompra(ItemVenda item) {
        return valorTotal + item.getValor() > getCliente().getLimiteCompras();
    }
}
