package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoPix {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobranca do valor no Pix.

        if(valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    // Uso do String.format é igual ao printf(%s %.2f)
                    String.format("Valor de depósito não pode ser menor ue %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Depósito", valorDeposito);

    }

}
