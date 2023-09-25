package com.algabank;

import com.javabank.Conta;
import com.javabank.ContaCorrente;

// ContaCorrenteComTributos depende de detalhes de implementacão da ContaCorrente.
public class ContaCorrenteComTributacao extends ContaCorrente {

    public static final double TAXA_IMPOSTO_MOVIMENTACAO = 0.1;

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }

    /*@Override
    public void transferir(Conta conta, double valor) {
        super.transferir(conta, valor);
        super.sacar(valor * TAXA_IMPOSTO_MOVIMENTACAO);
    }*/
}
