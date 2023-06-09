package com.algaworks.locadora;

public class PrecificacaoPorDia implements Precificacao {


    @Override
    public double calcularValorTotal(Notebook notebook, int horaUtilizadas) {
        double dias = Math.ceil(horaUtilizadas / 24d);
        return notebook.getPrecoPorDia() * dias;
    }


}
