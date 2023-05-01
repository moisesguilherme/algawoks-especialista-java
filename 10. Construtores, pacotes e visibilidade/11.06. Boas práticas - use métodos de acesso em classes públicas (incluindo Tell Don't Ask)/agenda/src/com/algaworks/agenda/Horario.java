package com.algaworks.agenda;

public class Horario {

    // colocar final vai proteger, mas tem um problema, as classes que esteja usando
    // externas vai precisar mudar
    //public final int hora;
    //public final int minuto;

    // trocando para array
    // problema dessa forma: vc não encapsulou e comeca a expor muito sua classe
    // e fica difícil alterar internamente. Vai quebrar o código q chama externametne.
    public int[] valores = new int[2];
    // Ideias do livro: Effect Java - Java Efetivo Joshua Bloch
    // sempre criar métodos de acessos em classes públicas, os métodos de acesso
    // getters e setters


    public Horario(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida: " + hora);
        }

        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido: " + minuto);
        }

        //this.hora = hora;
        //this.minuto = minuto;
        this.valores[0] = hora;
        this.valores[1] = minuto;

    }

}
