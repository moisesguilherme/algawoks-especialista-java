package com.algaworks.banco;

// Final, não vai deixar essa classe ter mais sub-classes "filho"
public final class ContaEspecial extends ContaInvestimento {

    private double tarifaMensal;
    private double limiteChequeEspecial;

    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

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

    public double getSaldoDisponivel() {
        return getSaldo() + getLimiteChequeEspecial();
    }


    /*
    // Não vai poder sobrescrever pq tem final no método na classe pai
    @Override
    public void depositar(double valorDeposito) {
        //super.depositar(valorDeposito);
    }
    */

    // A parti desse ponto ninguém mais vai sobrescrever
    @Override
    public final void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();
        System.out.printf("Saldo disponível: %.2f%n", getSaldoDisponivel());
    }

    public void setSaldo(double saldo) {

    }

    protected final void validarSaldoParaSaque(double valorSaque) {
        if (getSaldoDisponivel() < valorSaque) {
            throw new RuntimeException("Saldo insuficiente para saque");
        }

    }


    @Override
    public String toString() {
        // Evitar o  NullPointerException dentro da string
        return "ContaEspecial{" +
                "titular=" + getTitular() +
                ", agencia=" + getAgencia() +
                ", numero=" + getNumero() +
                ", saldo=" + getSaldo() +
                ", tarifaMensal=" + tarifaMensal +
                ", limiteChequeEspecial=" + limiteChequeEspecial +
                '}';
    }

}