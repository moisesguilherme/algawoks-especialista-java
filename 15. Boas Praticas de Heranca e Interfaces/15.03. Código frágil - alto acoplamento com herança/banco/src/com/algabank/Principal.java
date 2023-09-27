package com.algabank;

import com.javabank.Conta;
import com.javabank.ContaCorrente;

public class Principal {

    public static void main(String[] args) {

        //Padrão de projeto:
        // Decorator Pattern ou padrão decorate
                           //Decorando a conta.
                           //Tributacão conta corrente embrulha ContaCorrente
                           //TributacaoDecorator -> substituiu para PontuacaoDecorator
        //Conta conta1 = new PontuacaoDecorator(new ContaCorrente());
        PontuacaoDecorator pontuacao = new PontuacaoDecorator(new ContaCorrente());
        // --> com se fosse: TributacaoDecorator(new PontuacaoDecorator(new ContaCorrente()))
        //     TributacaoDecorator embrulha uma PontuacaoDecorator que embrulha uma contaCorrente
        Conta conta1 = new TributacaoDecorator(pontuacao);
        Conta conta2 = new ContaCorrente();

        conta1.depositar(1000);
        conta1.sacar(100);
        conta1.transferir(conta2, 100);

        System.out.printf("Saldo da conta 1: R$%.2f%n", conta1.getSaldo());
        System.out.printf("Saldo da conta 2: R$%.2f%n", conta2.getSaldo());
        System.out.printf("Pontos da conta 1: %d%n", pontuacao.getPontos());
    }

}