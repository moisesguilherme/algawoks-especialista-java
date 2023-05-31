package com.algaworks.fiscal;
// A primeira classe concreta que herdar da classe abstrata, vai precisar implementar
// todos os métodos abstratos
public class NotaFiscalProduto extends NotaFiscal {

    //Classes abstratas pode ter métodos abstratos e também métodos concretos.

    public static final double ALIQUOTA_IMPOSTOS_FEDERAIS = 0.18;
    public static final double ALIQUOTA_IMPOSTOS_ESTADUAIS = 0.12;

    private double valorFrete;

    public NotaFiscalProduto(String descricao, double valorTotal, double valorFrete) {
        super(descricao, valorTotal);
        this.valorFrete = valorFrete;
    }

    public double getValorFrete() {
        return valorFrete;
    }


    // É obrigatório implementar o método, pq ele é abstrato na superclasse
    @Override
    public double calcularImpostos() {
        double valorImpostos = getValorTotal() * ALIQUOTA_IMPOSTOS_FEDERAIS;
        valorImpostos += getValorTotal() * ALIQUOTA_IMPOSTOS_ESTADUAIS;

        return valorImpostos;
    }
}