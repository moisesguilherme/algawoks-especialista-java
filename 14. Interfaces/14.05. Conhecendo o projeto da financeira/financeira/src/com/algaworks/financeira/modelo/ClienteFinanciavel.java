package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    // Método já public e abstract
    public abstract double calcularLimiteAprovado();

    double calcularJuros(double valorSolicitado);


}
