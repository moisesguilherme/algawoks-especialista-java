package com.algaworks.sorteio;

public class Cliente {

    private String razaoSocial;
    private double faturamentoMensal;

    public Cliente() {
    }

    public Cliente(String razaoSocial, double faturamentoMensal) {
        this.razaoSocial = razaoSocial;
        this.faturamentoMensal = faturamentoMensal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public double getFaturamentoMensal() {
        return faturamentoMensal;
    }

    public void setFaturamentoMensal(double faturamentoMensal) {
        this.faturamentoMensal = faturamentoMensal;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", faturamentoMensal=" + faturamentoMensal +
                '}';
    }
}