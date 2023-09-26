package com.javabank;

public interface Conta {

    double getSaldo();
    void sacar(double valor);
    void depositar(double valor);
    void transferir(Conta conta, double valor);

    //Se a interface for alterada, quebra o código
    void aplicarEmInvestimento(double valor);




}