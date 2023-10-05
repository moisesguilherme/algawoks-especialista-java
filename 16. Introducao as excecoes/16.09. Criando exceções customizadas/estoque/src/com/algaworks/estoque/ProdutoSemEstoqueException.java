package com.algaworks.estoque;

public class ProdutoSemEstoqueException extends ProdutoException {


    private final int estoqueDisponivel;
    private final int estoqueNecesario;

    public ProdutoSemEstoqueException(String message, int estoqueDisponivel, int estoqueNecesario) {
        super(message);
        this.estoqueDisponivel = estoqueDisponivel;
        this.estoqueNecesario = estoqueNecesario;
    }

    public int getEstoqueDisponivel() {
        return estoqueDisponivel;
    }

    public int getEstoqueNecesario() {
        return estoqueNecesario;
    }
}
