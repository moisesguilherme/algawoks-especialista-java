package com.algaworks.agencia;

import java.util.ArrayList;

public class CadastroHotel {

    // Operador diamante <>
    private final ArrayList<Hotel> hoteis = new ArrayList<>(1000);

    public void adicionar(String nome, String cidade, double precoDiaria) {
        hoteis.add(new Hotel(nome, cidade, precoDiaria)); // Toda list tem o add
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

}
