package com.algaworks.estoque;

import java.math.BigDecimal;

@FunctionalInterface
public interface MinhaInterfaceFuncional {
    Produto setProduto(String nome, BigDecimal preco, int quantidade);
}
