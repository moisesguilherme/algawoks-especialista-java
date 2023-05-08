package com.algaworks.agenda;

public final class Horario {

    private final int hora;
    private final int minuto;

    public Horario(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        this.hora = hora;
    }

    public setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
        this.minuto = minuto;
    }

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
