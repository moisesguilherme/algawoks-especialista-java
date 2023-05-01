package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDeDepositoBoleto {

    public Recibo efetuarDeposito(Cartao cartao, double valorDeposito) {
        // TODO faz cobranca do valor no Boleto.

        // Quando vai adicionando regra de negócio fica difícil
        // alterar pois fica duplicado.
        /*if(valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    // Uso do String.format é igual ao printf(%s %.2f)
                    String.format("Valor de depósito não pode ser menor ue %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }*/

        //cartao.alterarSaldo(cartao.obterSaldo() + valorDeposito - Cartao.TARIFA_DEPOSITO);
        //cartao.saldo += valorDeposito - Cartao.TARIFA_DEPOSITO;
        cartao.debitar(valorDeposito);
        return new Recibo(cartao.obterTitular(), "Depósito", valorDeposito);

    }

}
