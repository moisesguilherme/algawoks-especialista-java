package com.algaworks.erp.estoque;

// com asterisco importa tudo do pacote
// se tiver 2 classes Object em pacotes diferentes com * ele não vai saber qual importar.
// import java.util.*
import java.util.Objects;
import java.util.UUID;

public class Produto {

    static final int QUANTIDADE_ESTOQUE_INICIAL = 100;

    // modificador default sem o public
    //final String codigo;
    public final String codigo;
    public String nome;
    public int quantidadeEstoque;

    //visibilidade e modificadores de acesso (public)
    public Produto() {
        this("Sem nome");
    }

    Produto(String nome) {
        this(nome, QUANTIDADE_ESTOQUE_INICIAL);
    }

    Produto(String nome, int estoqueInicial) {
        Objects.requireNonNull(nome, "Nome é obrigatório");

        if (estoqueInicial < 0) {
            throw new IllegalArgumentException("Estoque inicial não pode ser negativo");
        }

        this.nome = nome;
        this.quantidadeEstoque = estoqueInicial;
        this.codigo = UUID.randomUUID().toString();
    }

}
