package com.algabank;

import com.javabank.Conta;

import java.util.Objects;

public class TributacaoDecorator implements Conta {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;
    //Classe wrapper (embrulhar a outra)
    private Conta contaOriginal;

    //Futuramente pode usar outra conta, pois usa polimorfismo
    public TributacaoDecorator(Conta contaOriginal) {
        Objects.requireNonNull(contaOriginal);
        this.contaOriginal = contaOriginal;
    }

    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    //Method Delegate (Delegacão de método)
    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
        debitarImpostoMovimentacao(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
        debitarImpostoMovimentacao(valor);
    }

    private void debitarImpostoMovimentacao(double valorMovimentacao) {
        contaOriginal.sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }
}
