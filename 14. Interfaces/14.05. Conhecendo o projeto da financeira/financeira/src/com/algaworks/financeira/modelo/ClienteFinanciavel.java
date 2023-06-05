package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    //Diferenca entre classe abstrata e interface:
    // 1. uma classe pode herdar somente outra classe, não pode herdare 2 classes
    // 2. uma classe pode implementar uma ou várias interfaces
    // 3. uma interface não possui estado, não tem variável de instância

    //public static final
    double JUROS_BAIXO_RISCO = 1.0;
    double JUROS_MEDIO_RISCO = 1.5;
    double JUROS_ALTO_RISCO = 2.0;

    double calcularLimiteAprovado();


    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return JUROS_BAIXO_RISCO;
        } else if(isFinanciamentoGrandeValor(valorSolicitado)) {
            return JUROS_MEDIO_RISCO;
        }

        return JUROS_ALTO_RISCO;
    }

    public static boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    static boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }


}
