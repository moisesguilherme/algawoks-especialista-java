package com.algaworks.agenda;

// Se usar uma classe com visibilidade default, sem públic,
// a classe é visivél somente dentro do pacote
// Neste caso não é muito ruim não usar o encapsulamento
//class Horario {

public class Horario {


    //private int hora;
    //private int minuto;
    // Consegue mudar internamente sem quebrar o código externamente
    private int[] valores = new int[2];

    public Horario(int hora, int minuto) {
        setHora(hora);
        setMinuto(minuto);
    }

    public int getHora() {
        ///return hora;
        return valores[0];
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }
        //this.hora = hora;
        valores[0] = hora;
    }

    public int getMinuto() {
        //return minuto;
        return valores[1];
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }
        //this.minuto = minuto;
        valores[1] = minuto;
    }

    //Tell (diga oq é para fazer)
    public String formatar() {
        return String.format("%dh%dm", getHora(), getMinuto());
    }
}
