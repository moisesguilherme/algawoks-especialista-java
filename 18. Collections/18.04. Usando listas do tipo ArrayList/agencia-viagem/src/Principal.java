import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        cadastro.removerPorCidade("Fortim/CE");

        Collection<Hotel> hoteis = cadastro.obterTodos();
        //hoteis.addLast(); //mesmo do add, adiciona o final da lista. Add retorna um boolean
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(Collection<Hotel> hoteis) {
        for(Hotel hotel: hoteis) {
            System.out.printf("%s (%s) -> %.2f%n",
                    hotel.getNome(), hotel.getCidade(), hotel.getPrecoDiaria());
        }
    }

}
