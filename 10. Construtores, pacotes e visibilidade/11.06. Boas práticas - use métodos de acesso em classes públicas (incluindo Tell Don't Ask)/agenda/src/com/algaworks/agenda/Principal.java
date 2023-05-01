package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 55);
        // Não consegue adicionar pois é final
        // horario.hora = 20;
        System.out.printf("%dh%dm", horario.hora, horario.minuto);


    }

}
