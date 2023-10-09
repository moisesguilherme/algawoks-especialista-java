package com.algaworks.banco;

public class SaldoInsuficienteException extends OperacaoBancariaException{

    public double saldo;

    public SaldoInsuficienteException(String s) {
        super(s);
    }

    public SaldoInsuficienteException(String s, Double saldo) {
        super(s + " saldo atual: " + saldo );
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }
}
