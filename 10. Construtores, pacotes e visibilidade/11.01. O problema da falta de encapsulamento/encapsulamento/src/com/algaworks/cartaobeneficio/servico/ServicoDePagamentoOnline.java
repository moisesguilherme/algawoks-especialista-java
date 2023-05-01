package com.algaworks.cartaobeneficio.servico;

import com.algaworks.cartaobeneficio.Cartao;
import com.algaworks.cartaobeneficio.Estabelecimento;
import com.algaworks.cartaobeneficio.Recibo;

public class ServicoDePagamentoOnline {

    public Recibo efetuarPagamento(Estabelecimento estabelecimento,
                                   Cartao cartao, double valor) {

        if(cartao.obterSaldo() < valor ){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }

        cartao.alterarSaldo(cartao.obterSaldo() - valor);
        //cartao.saldo -= valor;
        // TODO realiza outras lógicas para efetuar o pagamento ao estabelecimento

        return new Recibo(cartao.obterTitular(), "Pagamento", valor);
    }

}
