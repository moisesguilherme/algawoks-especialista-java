package com.algaworks.fiscal;

//Essa é uma classe abstrata
public abstract class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    //Vai sobrescrever na classe Produto e Servico
    public double calcularImpostos() {
        return 0; //Não existe NotaFiscal genérica, ou é produto ou servico
    }

    public void emitir() {
        System.out.printf("Emitindo nota fiscal para: %s%n", getDescricao());
        System.out.printf("Valor total: %.2f%n", getValorTotal());
        // Importante vai executar o método da instancia q estiver executando
        // em calcularImposto, pode não ser dessa classe, e sim calcularImposto de outra classe
        System.out.printf("Impostos %.2f%n", calcularImpostos());
    }

}