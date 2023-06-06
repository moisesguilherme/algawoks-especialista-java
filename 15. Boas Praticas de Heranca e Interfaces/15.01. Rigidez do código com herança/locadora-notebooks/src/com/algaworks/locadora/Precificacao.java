package com.algaworks.locadora;

public interface Precificacao {

    //Interface para representar o tipo de precificacao,
    //Quando pensa em composicão,
    //Crie a interface pensando: o que repesenta o comportamento

    double calcularValorTotal(Notebook notebook, int horaUtilizadas);

}
