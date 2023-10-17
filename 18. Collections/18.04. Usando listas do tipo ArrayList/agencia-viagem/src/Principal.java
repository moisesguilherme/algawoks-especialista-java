import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        cadastro.removerPorCidade("Fortim/CE");

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        // enhanced for
        int[] numeros = {1,2,3};
        for (int numero : numeros) {

        }

        for(Hotel hotel: hoteis) {
            System.out.printf("%s (%s) -> %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }

        ListIterator<Hotel> hotelIterator = hoteis.listIterator(hoteis.size());
        while (hotelIterator.hasPrevious()) {
            Hotel hotel =  hotelIterator.previous();
            System.out.printf("%s (%s) -> %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
