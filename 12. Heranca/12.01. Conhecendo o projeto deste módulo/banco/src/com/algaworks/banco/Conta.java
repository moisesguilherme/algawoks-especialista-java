package com.algaworks.banco;

// Toda classe Java extende da classe Object
public class Conta extends Object {

    private Titular titular;
    private int agencia;
    private int numero;
    // protected pode ser acessado por sub-classe
    //protected double saldo;
    private double saldo;

    /*public Conta() {
        //super(); // precisa ser a primeira instrucão
        this(0);
    }*/

    // Quando cria um construtor com argumentos deixa de existir o
    // construtor padrão (sem argumentos)
    public Conta(double saldoInicial){
        this.saldo = saldoInicial;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldo() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser maior que 0");
        }

        validarSaldoParaSaque(valorSaque);

        saldo -= valorSaque;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) {
            throw new IllegalArgumentException("Valor do depósito deve ser maior que 0");
        }

        saldo += valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

}