package com.algaworks.financeira.modelo;

public class Fazenda extends Empresa implements ClienteFinanciavel  {

    public static final double PERCENTUAL_FATURAMENTO_LIMITE_CREDITO = 0.5;
    public static final double TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE = 1.2;
    public static final double TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE = 5;

    private double tamanhoEmHectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double tamanhoEmHectares) {
        super(razaoSocial, totalFaturamento);
        this.tamanhoEmHectares = tamanhoEmHectares;
    }

    public double getTamanhoEmHectares() {
        return tamanhoEmHectares;
    }

    //Precisa implementar esse método que vem lá da classe Empresa (Método abstrato)
    @Override
    public double calcularLimiteAprovado() {
        double limiteAprovado = getTotalFaturamento() * PERCENTUAL_FATURAMENTO_LIMITE_CREDITO;

        if (getTamanhoEmHectares() >= TAMANHO_MINIMO_EM_HECTARES_GRANDE_PROPRIEDADE) {
            limiteAprovado *= TAXA_ACRESCIMO_LIMITE_PARA_GRANDE_PROPRIEDADE;
        }

        return limiteAprovado;
    }

    // Comeca a ter código duplicado... nas outras classes, Industria, LojaVarejista

    /*@Override
    public double calcularJuros(double valorSolicitado) {
        if (valorSolicitado <= 100_000) {
            return 1.0;
        } else if(valorSolicitado <= 1_000_000) {
           return 1.5;
        }

        return 2.0;
    }*/

}