package com.algabank;

import com.javabank.Conta;
import com.javabank.ContaCorrente;

// ContaCorrenteComTributos depende de detalhes de implementacão da ContaCorrente.
public class ContaCorrenteComTributacao extends ContaCorrente {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    @Override
    public void sacar(double valor) {
        System.out.println(">> chamou sacar Override!");
        super.sacar(valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }

    // Problema de sobrescrever, se o método transferir da super classe, ele vai chamar
    // o método sacar.
    /*@Override
    public void transferir(Conta conta, double valor) {
        super.transferir(conta, valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }*/

    @Override
    public void aplicarEmInvestimento(double valor) {
        super.aplicarEmInvestimento(valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
        sacarTarifa(valor);
    }

    public void sacarTarifa(double valorMovimentacao) {
        super.sacar(valorMovimentacao * TAXA_IMPOSTO_MOVIMENTACAO);
    }

}
