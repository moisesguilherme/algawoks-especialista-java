package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    // Método já public e abstract
    public abstract double calcularLimiteAprovado();

    // Problema: Não consegue adicionar um novo método em classes que já implementam essa interface.
    // Default method
    // Java 8 -> permite implementar com código na interface
    public default double calcularJuros(double valorSolicitado) {
        if (valorSolicitado <= 100_000) {
            return 1.0;
        } else if(valorSolicitado <= 1_000_000) {
            return 1.5;
        }

        return 2.0;
    }


}
