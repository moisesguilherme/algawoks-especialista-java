package com.algaworks.erp.estoque;

import java.util.Objects;
import java.util.UUID;

// private, não funciona para classe
public class Produto {

    private static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    private final String codigo;
    // private, mesmo no mesmo pacote não tem acesso
    // somente a classe tem acesso
    private String nome;
    private int quantidadeEstoque;

    public Produto() {
        this("Sem nome");
    }

    public Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    // Faz sentido tornar um construtor privado
    private Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = gerarCodigo();
    }

    private String gerarCodigo() {
        return UUID.randomUUID().toString();
    }

}
