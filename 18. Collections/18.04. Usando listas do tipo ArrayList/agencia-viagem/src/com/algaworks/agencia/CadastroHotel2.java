package com.algaworks.agencia;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void removerPorCidade(String cidade) {
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        while (hotelIterator.hasNext()) {
            Hotel hotel = hotelIterator.next();
            if (hotel.getCidade().equals(cidade)) {
                hotelIterator.remove(); //remove o último
                //hoteis.remove(hotel); //erro
            }
        }


        //ArrayList<Hotel> hoteisParaRemocao = new ArrayList<>();
        /*for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            if (hotel.getCidade().equals(cidade)) {
                hoteisParaRemocao.add(hotel);
                //hoteis.remove(i);
                //problema do indice ao remover
                //i--;
            }
        }*/
        //hoteis.removeAll(hoteisParaRemocao);
    }

    public void remover(Hotel hotel) {
        boolean removido = hoteis.remove(hotel);

        if(!removido) {
            throw new HotelNaoEncontradoException("Hotel não encontrado para remocão");
        }
    }

    public void removerTodos() {
        hoteis.clear();
    }

}
