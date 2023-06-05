package com.algaworks.financeira.modelo;

public interface PessoaBonificavel {

    double calcularBonus(double percentualMetaAlcancada);

    // Problema: A classe Funcionário implementa a interface ClienteFinanciavel
    // e a classe PessoaBonificavel. Esse método está nas duas interfaces.
    // Neste casso vai dar um erro. (Só um exemplo, essa interface não vai ter esse método)
    /*default double calcularJuros(double valorSolicitado) {
        return 0;
    }*/
}
