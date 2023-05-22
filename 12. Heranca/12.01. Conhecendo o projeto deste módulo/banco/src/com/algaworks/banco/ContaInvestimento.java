package com.algaworks.banco;

public class ContaInvestimento extends Conta{

    private double valorTotalRendimento;

    public ContaInvestimento() {
        super(0);
    }

    public double getValorTotalRendimento() {
        return valorTotalRendimento;
    }

    public void creditarRendimentos(double percentualJuros) {
        double valorRendimentos = getSaldo() * percentualJuros / 100;
        this.valorTotalRendimento += valorRendimentos;
        depositar(valorRendimentos);
    }

}