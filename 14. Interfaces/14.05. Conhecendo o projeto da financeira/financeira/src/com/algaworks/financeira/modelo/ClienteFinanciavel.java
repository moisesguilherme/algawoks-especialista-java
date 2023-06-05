package com.algaworks.financeira.modelo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();


    //esse default, não é o nível de visibilidade default,
    //e sim a implementacão default para o méodo.
    // Não pode ter a visibilidade defualt e protected
    // se não tem nda, o padrão é o public
    default double calcularJuros(double valorSolicitado) {
        if (isFinanciamentoPequenoValor(valorSolicitado)) {
            return 1.0;
        } else if(isFinanciamentoGrandeValor(valorSolicitado)) {
            return 1.5;
        }

        return 2.0;
    }

    // Java 8 pode ter métodos estáticos em interfaces
    private boolean isFinanciamentoGrandeValor(double valorSolicitado) {
        return valorSolicitado <= 1_000_000;
    }

    //Método privado na interface, recurso java 9
    private boolean isFinanciamentoPequenoValor(double valorSolicitado) {
        return valorSolicitado <= 100_000;
    }


}
