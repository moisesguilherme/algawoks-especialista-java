package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
        System.out.println(horario.hora()); // tem acesso ao getter
        // Não existe setter, a classe é imutável
        // Não pode alterar o estado, ele é final.

        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        agendamentoCabelo.setHorario(new Horario(16, 20));

        System.out.println(agendamentoCabelo.getHorarioFormatado());
    }

}
