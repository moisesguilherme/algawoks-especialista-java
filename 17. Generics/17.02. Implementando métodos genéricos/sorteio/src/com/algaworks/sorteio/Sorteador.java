package com.algaworks.sorteio;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();

    // trocar para Object
    // se passar string retorna string, se for Cliente retorna Cliente
  //public Object sortear(Object[] objetos) {
    public static <T, X> T sortear(T[] objetos, X valor) {
        // X somente de exemplo, para passar mais de um valor
        if (objetos.length == 0) {
            throw new IllegalArgumentException("Mínimo de 1 objeto requerido");
        }

        int posicao = RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }

}