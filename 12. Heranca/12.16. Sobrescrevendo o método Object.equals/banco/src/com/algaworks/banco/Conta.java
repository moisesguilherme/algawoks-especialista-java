package com.algaworks.banco;

import java.util.Objects;

public class Conta {

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


    // Adicionou o método e é sobrescrito na colasse conta investimento
    public boolean possuiGratuidadeImperssao() {
        return false;
    }

    protected void validarSaldoParaSaque(double valorSaque) {
        System.out.println(">>> chamou: validarSaldoParaSaque, Conta");
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

    @Override
    public String toString() {
        return "Conta{" +
                "titular=" + titular +
                ", agencia=" + agencia +
                ", numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println(this.getClass());
        //System.out.println(obj.getClass());
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Conta conta = (Conta) obj;
        if(this.agencia != conta.agencia) return false;
        if(this.numero != conta.numero) return false;
        return true;
    }

    /* //Gerado pela IDE
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Conta conta = (Conta) o;

        if (agencia != conta.agencia) return false;
        if (numero != conta.numero) return false;
        return Objects.equals(titular, conta.titular);
    }
    */

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }

}