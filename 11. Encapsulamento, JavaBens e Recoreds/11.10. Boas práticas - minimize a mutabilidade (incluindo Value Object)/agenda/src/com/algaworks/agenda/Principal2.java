package com.algaworks.agenda;

public class Principal2 {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);
        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");

        //refatorando
        // pode perder o controle do objeto horário, precisa transformar em
        // um objeto imutável
        Horario novoHorario = CalculadoraHorario.somarDuasHoras(horario);

        System.out.println(agendamentoCabelo.getHorarioFormatado());
        System.out.println(novoHorario.formatar());
    }

}
