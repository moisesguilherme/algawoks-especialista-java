package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    //Diferenca entre classe abstrata e interface:
    // 1. uma classe pode herdar somente outra classe, não pode herdare 2 classes
    // 2. uma classe pode implementar uma ou várias interfaces
    // 3. uma interface não possui estado, não tem variável de instância

    int idade = 0; // igual a public static final int idade = 0;

    double calcularLimiteAprovado();


    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return 1.0;
        } else if(isFinanciamentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }

        return 2.0;
    }

    public static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }


}
