package com.algaworks.tempo;


// Não é uma boa prática pois alguma classe pode implemementar a interface
//public class CalculadoraTempo implements TempoConstants
public class CalculadoraTempo  {

    //ideal colocar nessa classe
    public static final int  SEGUNDOS_POR_MINUTO = 40;
    public static final int SEGUNDOS_POR_HORA = 3600;

    public static double converterSegundosEmHoras(int segundos) {
        //return (double) segundos / TempoConstants.SEGUNDOS_POR_HORA;
        return (double) segundos / SEGUNDOS_POR_HORA;
    }

    public static double converterSegundosEmMinutos(int segundos) {
        //return (double) segundos / TempoConstants.SEGUNDOS_POR_MINUTO;
        return (double) segundos / SEGUNDOS_POR_MINUTO;
    }

}