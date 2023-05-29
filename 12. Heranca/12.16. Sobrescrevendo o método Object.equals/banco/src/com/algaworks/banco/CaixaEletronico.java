package com.algaworks.banco;

public class CaixaEletronico {

    public static final double TARIFA_TRANSFERENCIA = 10;

    //Polimorfismo (muitas formas)
    //Tipo conta, vai usar somente os métodos da classe conta
    //Ele faz um upcasting, se contaOrigem for ContaEspecial, o objeto Conta continha sendo ContaEspecial
    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTranferencia) {
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d\n",
                valorTranferencia, contaOrigem.getAgencia(), contaDestino.getNumero(),
                contaDestino.getNumero(), contaDestino.getNumero()
                );

        contaOrigem.sacar(valorTranferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTranferencia);

        //Não consegue um método específico da conta especial, somente metodo de Conta
        //contaOrigem.debitarTarifaMensal(); //Método da ContaEspecial
    }



}
