package com.algaworks.agencia;

import java.util.ArrayList;

public class CadastroHotel2 {

    private final ArrayList<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

       /* if(hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }*/

        // No último elemento da lista
        hoteis.add(hotel);
        //hoteis.add(0, hotel);
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

}
