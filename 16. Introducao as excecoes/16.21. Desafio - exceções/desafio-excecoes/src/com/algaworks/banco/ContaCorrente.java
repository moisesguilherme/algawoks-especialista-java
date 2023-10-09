package com.algaworks.banco;

import java.rmi.server.RemoteObjectInvocationHandler;
import java.util.Objects;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            throw new OperacaoBancariaException("Valor de saque deve ser maior que 0");
            //System.out.println("Valor de saque deve ser maior que 0");
            //return false;
        }

        if (valor > this.saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque", this.saldo);
            //System.out.println("Conta sem saldo");
            //return false;
        }

        if (isInativa()) {
            throw new ContaInativaException("Não pode sacar em conta inativa");
            //System.out.println("Conta inativa");
            //return false;
        }

        this.saldo -= valor;
        return true;
    }

    public boolean depositar(double valor) {
        // Lancar um uma excecão conta inativa
        if (valor <= 0) {
            throw new OperacaoBancariaException("Valor de depósito deve ser maior que 0");
            //System.out.println("Valor de depósito deve ser maior que 0");
            //return false;
        }

        if (isInativa()) {
            //System.out.println("Conta inativa");
            //return false;
            throw new ContaInativaException("Conta inativa");
        }

        this.saldo += valor;
        return true;
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        Objects.requireNonNull(contaDestino);

        // Lancar uma excecao conta inativa
        if (contaDestino.isInativa()) {
            throw new ContaInativaException("Conta de destino está inativa");
            //System.out.println("Conta de destino está inativa");
            //return false;
        }

        /*if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }*/

        sacar(valor);
        contaDestino.depositar(valor);
        //return false;
    }

}
