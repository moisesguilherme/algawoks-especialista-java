package com.algaworks.cartaobeneficio;

public class Cartao {

    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;
    // não consegue alterar o titular do cartão com private
    private String titular;
    private double saldo;

    public Cartao(String titular) {
        this.titular = titular;
    }

    public String obterTitular() {
        return titular;
    }

    public double obterSaldo() {
        return saldo;
    }

    // Encapsulando o método, ou seja protegendo ele
    // colocar a regra de negócio nela, não permitindo ser negativo
    // Nesse exemplo a melhor forma foi criar o debitar e depositar
    /*public void alterarSaldo(double saldo) {
        this.saldo = saldo;
    }*/

    public void debitar(double valorDebito) {
        if(obterSaldo() < valorDebito ){
            throw new RuntimeException("Saldo insuficiente para pagamento");
        }
        saldo -= valorDebito;
    }

    // Trazer as regras de negócio para a classe cartão
    // o if de verificacão que está na classe Servico...
    public void depositar(double valorDeposito) {

        if(valorDeposito < VALOR_MINIMO_DEPOSITO) {
            throw new IllegalArgumentException(
                    String.format("Valor de depósito não pode ser menor ue %.2f", Cartao.VALOR_MINIMO_DEPOSITO)
            );
        }

        saldo += valorDeposito - TARIFA_DEPOSITO;
    }


}
