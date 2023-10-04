package com.algaworks.estoque;

public class ProdutoInativoException extends RuntimeException {

    public ProdutoInativoException(String mensagem) {
        super(mensagem);
    }
}
