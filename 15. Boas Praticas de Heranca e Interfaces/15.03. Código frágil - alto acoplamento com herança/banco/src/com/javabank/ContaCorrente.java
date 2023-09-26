package com.javabank;

public class ContaCorrente implements Conta {

    private double saldo;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        System.out.println(">>> chamou sacar super classe");
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta conta, double valor) {
        //this.saldo -= valor;
        sacar(valor); //Problema
        sacarTarifa(15); // vai chamar a do ContaCorrenteComTribuicao
        conta.depositar(valor);
    }

    @Override
    public void aplicarEmInvestimento(double valor) {
        System.out.println(">>> chamou sacar super aplicarEmInvestimento");
        this.saldo -= valor;
        // TODO aqui aplicaria o dinheiro no investimento
    }

    public void sacarTarifa(double valorTarifa) {
        this.saldo -= valorTarifa;
    }

}