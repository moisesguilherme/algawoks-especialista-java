package com.algaworks.financeira.modelo;

//Classe abstrata
public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel{

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return 0.8;
    }
}
