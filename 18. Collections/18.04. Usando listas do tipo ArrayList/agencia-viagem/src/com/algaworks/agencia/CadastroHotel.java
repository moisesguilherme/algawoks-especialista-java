package com.algaworks.agencia;

import java.util.ArrayList;

public class CadastroHotel {

    // Operador diamante <>
    private final ArrayList<Hotel> hoteis = new ArrayList<>(1000);

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

}
