package com.algaworks.sorteio;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();

    // trocar para Object
    public static Object sortear(Object[] objetos) {
        if (objetos.length == 0) {
            throw new IllegalArgumentException("Mínimo de 1 objeto requerido");
        }

        int posicao = RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }

}