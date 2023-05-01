package com.algaworks.agenda;

public class Horario {

    public int hora;
    public int minuto;

    // Ideias do livro: Effect Java - Java Efetivo Joshua Bloch
    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }

        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;

    }

}
