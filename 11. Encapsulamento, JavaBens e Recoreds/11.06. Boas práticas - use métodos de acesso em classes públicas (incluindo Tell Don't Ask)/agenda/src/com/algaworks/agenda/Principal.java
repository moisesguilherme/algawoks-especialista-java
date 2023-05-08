package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 55);

        // Tell Don't ASK (part Don't Ask) não pergunte...
        // ASK.. pedindo a hora, pedindo o minuto
        // me dá a hora... getHora()
        //System.out.printf("%dh%dm", horario.getHora(), horario.getMinuto());
        // TELL
        // Formata a hora e traga ela formatada
        System.out.println(horario.formatar());

    }

}
