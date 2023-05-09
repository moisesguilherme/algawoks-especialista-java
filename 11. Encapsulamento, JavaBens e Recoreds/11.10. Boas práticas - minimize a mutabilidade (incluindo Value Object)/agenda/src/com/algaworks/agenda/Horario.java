package com.algaworks.agenda;

// Final em classe, não pode ser herdada.
public final class Horario {

    // adiciona o final (imutável)
    // ver construtor
    private final int hora;
    private final int minuto;

    public Horario(int hora, int minuto) {
        //precisa inicializar no construtor

        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }

        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        this.hora = hora;
        this.minuto = minuto;
        //setHora(hora);
        //setMinuto(minuto);
    }

    //Tirou os setters
    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public String formatar() {
        return String.format("%dh%dm", getHora(), getMinuto());
    }

}
