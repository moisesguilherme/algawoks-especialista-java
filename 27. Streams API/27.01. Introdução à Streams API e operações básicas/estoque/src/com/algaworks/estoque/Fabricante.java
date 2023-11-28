package com.algaworks.estoque;

import java.util.Objects;

// record já tem o equals implementado
public record Fabricante(String nome) {


    // Implementei para saber se vai chamar
    @Override
    public int hashCode() {
        System.out.println(">>>>" + nome);
        return Objects.hash(nome);
    }
}
