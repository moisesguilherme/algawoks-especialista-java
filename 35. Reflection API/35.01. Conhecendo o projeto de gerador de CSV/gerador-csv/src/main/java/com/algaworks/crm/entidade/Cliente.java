package com.algaworks.crm.entidade;

import com.algaworks.csv.Campo;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cliente {

    @Campo
    private final Long codigo;
    @Campo
    private final String nome;
    @Campo
    private final LocalDate dataNascimento;
    private BigDecimal limiteCredito = new BigDecimal("120000");

    public Cliente(Long codigo, String nome, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

}