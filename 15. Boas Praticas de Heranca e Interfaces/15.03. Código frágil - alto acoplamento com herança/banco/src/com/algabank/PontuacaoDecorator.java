package com.algabank;

import com.javabank.Conta;

public class PontuacaoDecorator extends ContaBaseDecorator {

    private int pontos;

    public PontuacaoDecorator(Conta contaOriginal) {
        super(contaOriginal);
    }


    public int getPontos() {
        return pontos;
    }

    // Remove todos com a classe abstrata

    // Delegate Methods
    // Esse método só delega, um ponto negativo da composicão que
    // precisa criar os métodos apenas para isso.
    // para resolver isso pode criar a classe abstrata
    /*@Override
    public double getSaldo() {
        return contaOriginal.getSaldo();
    }

    @Override
    public void sacar(double valor) {
        contaOriginal.sacar(valor);
    }
    */
    // Somente o método depositar
    @Override
    public void depositar(double valor) {
        getContaOriginal().depositar(valor);
        pontos += valor / 100;
    }
    /*
    @Override
    public void transferir(Conta conta, double valor) {
        contaOriginal.transferir(conta, valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        contaOriginal.aplicarEmInvestimento(valor);
    }*/
}
