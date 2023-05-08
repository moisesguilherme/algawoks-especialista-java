package com.algaworks.agenda;

public class Principal1 {

    public static void main(String[] args) {
        Integer idade = 30;
        //Classe imutável
        //Classe Integer é imútavel, vc não altera o valor, cria uma nova instância
        Integer novaIDade = idade + 1;

        //Classe mutável
        Horário horario = new Horario(10, 30);
        // Problema de uma classe mutável:
        // -
        horario.setHora(15);


    }

}
