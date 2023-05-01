package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoBoleto {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobranca do valor no Boleto.

        cartao.debitar(valorDeposito);
        return new Recibo(cartao.getTitular(), "Depósito", valorDeposito);

    }

}
