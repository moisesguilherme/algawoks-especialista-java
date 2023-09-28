package com.javabank;

public interface Conta {

    double getSaldo();
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta conta, double valor);
    void aplicarEmInvestimento(double valor);

    void imprimirSaldo();

    //Solucão: Default method, a partir do java 8, ele tem implementacão
    /*default void imprimirSaldo() {
        System.out.printf("Seu saldo é de R$%.2f%n", getSaldo());
    }*/

}