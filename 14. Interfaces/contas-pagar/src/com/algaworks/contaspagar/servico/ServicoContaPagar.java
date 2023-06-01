package com.algaworks.contaspagar.servico;

import com.algaworks.pagamento.*;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;
    // Não cria com:  private MetodoPagamento metodoPagamento = new MetodoPagamento()

    // Faz a injecão de dependência é um tipo de inversão de controle
    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        //ServicoContaPagar está fixo para pix precisamos criar um outra forma de pagamento.

        //MetodoPagamento metodoPagamento = new Pix();
        // Precisa alterar para new Transferencia();
        // Não pode ter acoplamento com as classes concretas de métodos de pagamento
        // Somente com a iterface, e não com a implementacão.
        //MetodoPagamento metodoPagamento = new Transferencia();


        // Poderia ter outras regras de negócio aqui
        // como por exemplo registrar o pagamento no banco de dados,
        // enviar uma notificacão por e-mail, etc.

        metodoPagamento.pagar(documento);
    }


}
