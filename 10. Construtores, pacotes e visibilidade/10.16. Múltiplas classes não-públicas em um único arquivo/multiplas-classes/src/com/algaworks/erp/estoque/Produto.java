package com.algaworks.erp.estoque;

import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private final String codigo = "AAA";
    private String nome;
    private int quantidadeEstoque;

    public Produto() {
        this("Sem nome");
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    private Produto(String nome, int estoqueInicial) {
    }

    private String gerarCodigo() {
        return UUID.randomUUID().toString();
    }


}
