package com.algabank;

import com.javabank.Conta;

public class PontuacaoDecorator implements Conta {

    private Conta contaOriginal;
    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        this.contaOriginal = contaOriginal;
    }


    public int getPontos() {
        return pontos;
    }

    // Delegate Methods
    // Esse método só delega, um ponto negativo da composicão que
    // precisa criar os métodos apenas para isso.
    // para resolver isso pode criar a classe abstrata
    @Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }

    @Override
    public void depositar(double valor) {
        contaOriginal.depositar(valor);
        pontos += valor / 100;
    }

    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }
}
