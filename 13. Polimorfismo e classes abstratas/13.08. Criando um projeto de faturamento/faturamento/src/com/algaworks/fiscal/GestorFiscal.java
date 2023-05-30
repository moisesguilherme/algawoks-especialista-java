package com.algaworks.fiscal;

public class GestorFiscal {
    //varArg...
    public void emitirNotasFiscais(NotaFiscal... notasFiscais) {
        for(NotaFiscal notaFiscal : notasFiscais) {
            notaFiscal.emitir(); //Usa polimorfismo
            System.out.println("--------------");
        }
    }
}
