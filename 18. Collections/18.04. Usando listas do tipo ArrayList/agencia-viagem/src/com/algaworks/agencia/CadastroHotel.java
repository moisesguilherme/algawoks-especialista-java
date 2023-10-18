package com.algaworks.agencia;

import java.util.*;

public class CadastroHotel {
    // Usando interface Collection, pode alterar o ArrayList para LinkedList
    // e não precisa alterar o resto do código
    // usando uma interface menos abstrata como List
    private final List<Hotel> hoteis = new ArrayList<>();

    public void adicionar(String nome, String cidade, double precoDiaria) {
        Hotel hotel = new Hotel(nome, cidade, precoDiaria);

        if (hoteis.contains(hotel)) {
            throw new HotelJaExistenteException("Hotel já foi adicionado");
        }

        hoteis.add(hotel); //Final
    }

    public List<Hotel> obterTodos() {
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
