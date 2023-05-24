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

        //indicie
        //hoteis.add(0, hotel);
        hoteis.add(hotel); //Final
    }

    public ArrayList<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if(hotel.getCidade().equals(cidade)) {
                hoteis.remove(i);
                i--;
            }
        }
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if(!removido) {
            throw new HotelNaoEncontradoException("Hotel não encotrado para remocão");
        }
    }

}
