package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.*;

public class ServicoContaPagar {

    // Importante saber a diferenca entre classes abastratas e interfaces.
    // Usando os recuros da classes abstratas, conseguimos fazer uso do polimorfismo
    public void pagar(DocumentoPagavel documento) {

        //ServicoContaPagar está fixo para pix precisamos criar um outra forma de pagamento.

        //MetodoPagamento metodoPagamento = new Pix();
        // Precisa alterar para new Transferencia();
        MetodoPagamento metodoPagamento = new Transferencia();


        // Poderia ter outras regras de negócio aqui
        // como por exemplo registrar o pagamento no banco de dados,
        // enviar uma notificacão por e-mail, etc.

        metodoPagamento.pagar(documento);
    }


}
