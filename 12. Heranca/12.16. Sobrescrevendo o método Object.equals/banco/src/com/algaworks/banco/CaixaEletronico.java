package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;

    public void transferir(ContaEspecial contaOrigem, ContaEspecial contaDestino, double valorTranferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d",
                valorTranferencia, contaOrigem.getAgencia(), contaDestino.getNumero(),
                contaDestino.getNumero(), contaDestino.getNumero()
                );

        contaOrigem.sacar(valorTranferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTranferencia);
    }

    //Sobrecarga
    //Criar outro método não é uma boa solucão.
    public void transferir(ContaEspecial contaOrigem, ContaSalario contaDestino, double valorTranferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d",
                valorTranferencia, contaOrigem.getAgencia(), contaDestino.getNumero(),
                contaDestino.getNumero(), contaDestino.getNumero()
        );

        contaOrigem.sacar(valorTranferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTranferencia);
    }

}
