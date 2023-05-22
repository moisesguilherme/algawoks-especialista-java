package com.algaworks.banco;

public class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    public void debitarTarifaMensal() {
        sacar(getTarifaMensal());
    }
    // @Override não compila
    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }
    @Override // é uma sob-escrita da classe conta
    public void imprimirDemonstrativo() {
        //System.out.println("método sobrescrito");
        // Vamos resolver o código duplicado
        System.out.println();
        System.out.printf("Agência: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular().getNome());
        System.out.printf("Saldo: %.2f%n", getSaldo());
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponivel());
    }

    // Não consegue restringir mais que da super-classe
    // private
    // aceita protected, ou public
    public void setSaldo(double saldo) {

    }

    protected void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }

}