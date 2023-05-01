package com.algaworks.cartaobeneficio;

import java.io.Serializable;

public class Cartao implements Serializable {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;

    private String titular;
    private double saldo;
    // boolean com isAtivo
    private boolean ativo;

    // Para ser JavaBean precisa:
    // Regra #1 - ter um construtor sem argumentos.
    //  Caso a classe não tenha um construtor é gerado uma padrão
    //  No caso essa classe tem um construtor com argumentos, que seta o titular,
    //  então precisa, criar um construor vazio que chame ele.

    // Regra #2 Implementar uma interface para dizer que essa classe é serializada.
    //  Serializer, vai transforma o objeto em fluxo de bytes para transferir via rede


    public Cartao() {

    }

    public Cartao(String titular) {
        this.titular = titular;
    }


    public boolean isAtivo() {
        return ativo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valorDebito) {
        if(getSaldo() < valorDebito ){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }
        saldo -= valorDebito;
    }

    public void depositar(double valorDeposito) {

        if(valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor ue %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }

}
