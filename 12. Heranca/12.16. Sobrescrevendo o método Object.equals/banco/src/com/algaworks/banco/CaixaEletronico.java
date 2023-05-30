package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;
    public static final double TARIFA_IMPRESSAO_DEMOSTRATIVO = 5;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTranferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d\n",
                valorTranferencia, contaOrigem.getAgencia(), contaDestino.getNumero(),
                contaDestino.getNumero(), contaDestino.getNumero()
                );

        contaOrigem.sacar(valorTranferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTranferencia);
    }

    // Fazendo sobrecarga para evitaro uso do instanceof
    public void imprimirDemostrativo(Conta conta) {
        debitarTarifaImpressaoDemostrativo(conta);
        conta.imprimirDemonstrativo();
    }

    public void imprimirDemostrativo(ContaInvestimento contaInvestimento) {
        if (contaInvestimento.getValorTotalRendimentos() > 0) {
            System.out.println("Impressão do demonstrativo é gratuito");
        } else {
            debitarTarifaImpressaoDemostrativo(contaInvestimento);
        }
        contaInvestimento.imprimirDemonstrativo();
    }

    private static void debitarTarifaImpressaoDemostrativo(Conta conta) {
        System.out.printf("Custo da impressao: R$%.2f%n", TARIFA_IMPRESSAO_DEMOSTRATIVO);
        conta.sacar(TARIFA_IMPRESSAO_DEMOSTRATIVO);
    }


}
