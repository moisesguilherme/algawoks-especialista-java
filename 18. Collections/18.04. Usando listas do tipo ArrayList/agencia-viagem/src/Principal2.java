import com.algaworks.agencia.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal2 {


    public static void main(String[] args) {
        CadastroHotel2 cadastro = new CadastroHotel2();
        cadastro.adicionar("Jaguaribe Lodge", "Fortim/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);
        cadastro.adicionar("Tivoli Ecoresort", "Fortim/CE", 1400);
        cadastro.adicionar("Hotel Fazenda Dona Carolina", "Ceara/CE", 1300);
        cadastro.adicionar("Vila Selvagem", "Fortim/CE", 1300);

        ArrayList<Hotel> hoteis = cadastro.obterTodos();
        imprimirHoteis(hoteis);
    }

    //Usando iterator
    private static void imprimirHoteis(ArrayList<Hotel> hoteis) {
        // Tipo parametrizado <Hotel>
        Iterator<Hotel> hotelIterator = hoteis.iterator();
        // Somente chamar o next()
        System.out.println(hotelIterator.next());
        System.out.println(hotelIterator.next());
        System.out.println(hotelIterator.next());

        /*for (int i = 0; i < hoteis.size(); i++) {
            Hotel hotel = hoteis.get(i);
            System.out.printf("%s (%s) -> %.2f%n", hotel.getNome(),
                    hotel.getCidade(), hotel.getPrecoDiaria());
        }*/
    }
}

