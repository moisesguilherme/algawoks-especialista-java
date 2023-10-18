package com.algaworks.agencia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class CadastroHotel {

    private final Vector<Hotel> hoteis = new Vector<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel); //Final
    }

    public Vector<Hotel> obterTodos() {
        return hoteis;
    }

    public void removerPorCidade(String cidade) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel =  hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove(); // remove o último
                //hoteis.remove(hotel); // Não funciona
            }
        }
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if(!removido) {
            throw new HotelNaoEncontradoException("Hotel não encotrado para remocão");
        }
    }

    public void removeTodos() {
        hoteis.clear();
    }

}
