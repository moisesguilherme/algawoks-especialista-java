package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {

        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        // corrompe os dados (alteracao de propriedade)
        horario.setHora(11);
        horario.setMinuto(4);
        Agendamento agendamentoBarba = new Agendamento(horario, "Feitio de barba");

        //proteje os objetos com a cópia defensiva
        agendamentoCabelo.getHorario().setHora(20);

        imprimir(agendamentoCabelo);
        imprimir(agendamentoBarba);
    }

    private static void imprimir(Agendamento agendamento) {
        System.out.printf("%s às %s%n", agendamento.getDescricao(), agendamento.getHorarioFormatado());
    }
}

