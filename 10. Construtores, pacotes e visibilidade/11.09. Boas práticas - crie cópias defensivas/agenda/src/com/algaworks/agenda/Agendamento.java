package com.algaworks.agenda;

public class Agendamento {

    // Não pode alterar o horario
    private final Horario horario;
    private String descricao;

    public Agendamento(Horario horario, String descricao) {
        //criar uma cópia defensiva
        //this.horario = horario;
        this.horario = new Horario(horario.getHora(), horario.getMinuto());
        //this.descricao = descricao;
    }

    public Horario getHorario() {
        //Não retornar a instância que está trabalhando
        //faz uma cópia para altera a cópia
        return new Horario(horario.getHora(), horario.getMinuto());
        //return horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorarioFormatado() {
        return horario.formatar();
    }

}
