package com.algaworks.locadora;

public class Locacao {

    private Notebook notebook;
    private Precificacao precificacao;

    public Locacao(Notebook notebook, Precificacao precificacao) {
        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao()
                .calcularValorTotal(getNotebook(), horasUtilizadas);
        return valorTotal;
    }

}