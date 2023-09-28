package com.algaworks.tempo;


// Não é uma boa prática pois alguma classe pode implemementar a interface
//public class CalculadoraTempo implements TempoConstants
public class CalculadoraTempo  {


    public static double converterSegundosEmHoras(int segundos) {
        return (double) segundos / TempoConstants.SEGUNDOS_POR_HORA;
    }

    public static double converterSegundosEmMinutos(int segundos) {
        return (double) segundos / TempoConstants.SEGUNDOS_POR_MINUTO;
    }

}