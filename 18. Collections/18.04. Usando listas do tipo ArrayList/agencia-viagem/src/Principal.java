import com.algaworks.agencia.CadastroHotel;
import com.algaworks.agencia.Hotel;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        CadastroHotel cadastro = new CadastroHotel();

        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Itatiba/SP", 2200);
        cadastro.adicionar("Tivoli Ecoresort", "Praia do Forte/BA", 2000);
        cadastro.adicionar("Mercure", "Uberlândia/MG", 400);

        /*
        System.out.println(cadastro.obterTodos());

        // get retorna um object, com a lista "cru" sem generic
        Hotel hotel = (Hotel) cadastro.obterTodos().get(1);
        System.out.println(hotel.getNome());
        */

        ArrayList hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    private static void imprimirHoteis(ArrayList hoteis) {
        for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = (Hotel) hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
            hotel.getCidade(), hotel.getPrecoDiaria());
        }

    }



}
