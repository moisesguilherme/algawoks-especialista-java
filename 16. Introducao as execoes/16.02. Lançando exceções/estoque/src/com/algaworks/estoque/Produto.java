package com.algaworks.estoque;

import java.util.Objects;

public class Produto {

    private String nome;
    private int quantidadeEstoque;
    private boolean ativo;

    public Produto(String nome) {
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.requireNonNull(nome, "Nome deve ser informado");
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public boolean isInativo() {
        return !isAtivo();
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    public void retirarEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidadeEstoque += quantidade;
    }

}