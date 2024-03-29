package com.algaworks.banco;

// Toda classe Java extende da classe Object
public class Conta extends Object {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;

    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }

    public final double getSaldo() {
        return saldo;
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

    // Com final ninguém vai conseguir sobrescrever esse método
    public final void depositar(double valorDeposito) {
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


    /*@Override
    public String toString() {
        return String.format("Conta(titular=%s, agencia=%d, numero=%d)",
                titular.getNome(), agencia, numero);
    }*/

    //usando o wizard da ide

    @Override
    public String toString() {
        // Evitar o  NullPointerException dentro da string
        return "Conta{" +
                "titular=" + (titular != null ? titular : null) +
                ", agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }
}